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

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/ingresos")
public class IngresosControlador {

    @Autowired
    private IngresosServicios ingresosServicios;
    @Autowired
    private UsuariosServicios usuariosServicios;
    @Autowired
    private MedicosServicios medicosServicios;

    @PostMapping("/crear")
    public String crearIngreso(@ModelAttribute Ingresos ingreso, @ModelAttribute Usuarios usuarios, @ModelAttribute Medicos medicos, Model model){
        // Asigna y establece la hora de creación
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        ingreso.setIngresoCreado(currentDateTime);

        ingreso.setUsuarios(usuarios);
        ingreso.setMedicos(medicos);

        ingresosServicios.save(ingreso);

        return "redirect:/ingresos/listado-ingresos";
    }

    //añadir ingreso
    @GetMapping("/crear-ingreso")
    public String showCreateIngresoForm(Model model) {
        Ingresos ingresos = new Ingresos();
        List<Usuarios> usuarios = usuariosServicios.findAll();
        List<Medicos> medicos = medicosServicios.findAll();

        model.addAttribute("ingreso", ingresos);
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("medicos", medicos);
        
        return "views/Ingresos/crear-ingreso";
    }

    //Obtener médico para editar en html
    @GetMapping("/detalle/{id}")
    public String verIngresoDetalle(@PathVariable Long id, Model model, HttpSession session) {
        Ingresos ingreso = ingresosServicios.findById(id);

        model.addAttribute("ingreso", ingreso);
        session.setAttribute("creado_dia", ingreso.getIngresoCreado());
        return "/views/Ingresos/detalle-ingreso";
    }

    /* Se actualiza poniendo la hora de forma automática*/
    // Actualizar un médico (POST)
    @PostMapping("/actualizar/{id}")
    public String actualizarMedico(@ModelAttribute("ingreso") Ingresos ingreso, BindingResult result, Model model, HttpSession session) {
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        ingreso.setIngresoModificado(currentDateTime);
        LocalDateTime medicCreado = (LocalDateTime) session.getAttribute("creado_dia");
        ingreso.setIngresoCreado(medicCreado);
        ingresosServicios.save(ingreso);
        return "redirect:/medicos/listado-medicos";
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