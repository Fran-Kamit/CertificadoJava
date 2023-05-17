package com.spring.clinica.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.spring.clinica.Modelo.Ingresos;
import com.spring.clinica.Modelo.Medicos;
import com.spring.clinica.Modelo.Usuarios;
import com.spring.clinica.Servicios.IngresosServicios;
import com.spring.clinica.Servicios.MedicosServicios;
import com.spring.clinica.Servicios.UsuariosServicios;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import javax.validation.Valid;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
@RequestMapping("/ingresos")
public class IngresosControlador {

    @Autowired
    private IngresosServicios ingresosServicios;
    
    @Autowired
    private UsuariosServicios usuariosServicios;

    @Autowired
    private MedicosServicios medicosServicios;

    @PostMapping("/ingreso")
    public String createIngreso(@ModelAttribute Ingresos ingreso) {
        ingresosServicios.save(ingreso);
        return "redirect:/ingresos/listado-ingresos";
    }

    //añadir ingreso
    @PostMapping("/ingresos/crear")
    public String createIngreso(@Valid @ModelAttribute Ingresos ingresos, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        
        UUID usuarioId = ingresos.getUsuarios().getUsuarCodigoIdentificacion();
        Usuarios usuario = usuariosServicios.findById(usuarioId);
        
        if (usuario == null) {
            return "error";
        }
    
        ingresos.setUsuarios(usuario);
        ingresosServicios.save(ingresos);
        return "redirect:/ingresos/listado-ingresos";
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

            return "views/Ingresos/editar-ingreso";
        } catch (NoSuchElementException e) {
            return "error"; // Mostrar una página de error personalizada si la reparación no se encuentra
        }
    }

    //editar ingreso
    @PostMapping("/actualizar-post")
    public String updateIngreso(@Valid @ModelAttribute("ingreso") Ingresos ingresos, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // Manejar errores de validación aquí
            return "views/Ingresos/editar-ingreso";
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
        return "views/Ingresos/listado-ingresos";
    }

    @GetMapping("/ingresos/agregar")
    public String addIngreso(Model model) {
        Ingresos ingreso = new Ingresos();
        List<Medicos> medicos = medicosServicios.findAll();
        List<Usuarios> usuarios = usuariosServicios.findAll();

        model.addAttribute("ingresos", ingreso);
        model.addAttribute("medicos", medicos);
        model.addAttribute("usuarios", usuarios);

        return "views/Ingresos/agregar";
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ingresos> updateIngreso(@PathVariable Long id, @Valid @RequestBody Ingresos ingresos) {
        Ingresos actualizarIngresos = ingresosServicios.update(id, ingresos);
        return new ResponseEntity<>(actualizarIngresos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarIngreso(@PathVariable Long id) {
        ingresosServicios.deleteById(id);
        return "redirect:/ingresos/listado-ingresos";
    }
}