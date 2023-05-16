package com.spring.clinica.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.spring.clinica.Modelo.Ingresos;
import com.spring.clinica.Modelo.Medicos;
import com.spring.clinica.Modelo.Usuarios;
import com.spring.clinica.Repositorios.IngresosRepositorio;
import com.spring.clinica.Repositorios.UsuariosRepositorio;
import com.spring.clinica.Servicios.IngresosServicios;
import com.spring.clinica.Servicios.MedicosServicios;
import com.spring.clinica.Servicios.UsuariosServicios;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
@RequestMapping("/ingresos")
public class IngresosControlador {

    @Autowired
    private IngresosServicios ingresosServicios;

    @Autowired
    private IngresosRepositorio ingresosRepositorio;
    
    @Autowired
    private UsuariosServicios usuariosServicios;

    @Autowired
    private UsuariosRepositorio usuariosRepositorio;

    @Autowired
    private MedicosServicios medicosServicios;

    @PostMapping("/ingresos")
    public String createIngreso(@ModelAttribute Ingresos ingreso) {
        ingresosServicios.save(ingreso);
        return "redirect:/ingresos/listado-ingresos";
    }

    //añadir ingreso
    @PostMapping("/ingresos/ingreso")
    public String createIngreso(@ModelAttribute Ingresos ingresos, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        
        UUID usuarioId = ingresos.getUsuarios().getUsuarCodigoIdentificacion();
        Optional<Usuarios> usuarioOpcional = usuariosRepositorio.findById(usuarioId);
        
        if (!usuarioOpcional.isPresent()) {
            return "error";
        }
        
        Usuarios usuario = usuarioOpcional.get();
        ingresos.setUsuarios(usuario);
        ingresosRepositorio.save(ingresos);
        return "success";
    }

    //cargar editar ingreso
    @GetMapping("/editar/{id}")
    public String showEditIngresoForm(@PathVariable("id") Long id, Model model) {
        try {
            Ingresos ingreso = ingresosServicios.findById(id);
            List<Medicos> medicos = medicosServicios.findAll();
            List<Usuarios> usuarios = usuariosServicios.findAll();

            model.addAttribute("ingreso", ingreso);
            model.addAttribute("medico", medicos);
            model.addAttribute("usuarios", usuarios);

            return "vista/ingresos/editar-ingreso";
        } catch (RuntimeException e) {
            return "error"; // Mostrar una página de error personalizada si la reparación no se encuentra
        }
    }

    //editar ingreso
    @PostMapping("/actualizar-post")
    public String updateReparacion(@ModelAttribute("ingreso") Ingresos ingresos, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // Manejar errores de validación aquí
            return "vista/ingresos/editar-ingreso";
        }

        ingresosServicios.save(ingresos);

        return "redirect:/ingresos/listado-ingresos"; // Redirige al usuario a la lista de reparaciones después de guardar los cambios
    }

    @GetMapping
    public String muestraIngresos(Model model) {
        List<Ingresos> ingresos = ingresosServicios.findAll();
        model.addAttribute("ingresos", ingresos);
        return "ingresos";
    }

    @GetMapping("/listado-ingresos")
    public String listadoIngresos(Model model) {
        List<Ingresos> ingresos = ingresosServicios.findAll();
        List<Usuarios> usuarios = usuariosServicios.findAll();
        List<Medicos> medicos = medicosServicios.findAll();
        model.addAttribute("ingresos", ingresos);
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("medicos", medicos);
        return "/vista/ingresos/listado-ingresos";
    }

    @GetMapping("/repair-add")
    public String addIngreso(Model model) {
        Ingresos ingreso = new Ingresos();
        List<Medicos> medicos = medicosServicios.findAll();
        List<Usuarios> usuarios = usuariosServicios.findAll();

        model.addAttribute("ingresos", ingreso);
        model.addAttribute("medicos", medicos);
        model.addAttribute("usuarios", usuarios);

        return "vista/ingreso/add-ingreso";
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ingresos> updateReparacion(@PathVariable Long id, @Valid @RequestBody Ingresos ingresos) {
        Ingresos actualizarIngresos = ingresosServicios.update(id, ingresos);
        return new ResponseEntity<>(actualizarIngresos, HttpStatus.OK);
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarReparacion(@PathVariable Long id) {
        ingresosServicios.deleteById(id);
        return "redirect:/ingreso/listado-ingreso";
    }
}