package com.spring.clinica.Controladores;

import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;
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

    // Instancia a Sanitizador de HTML import org.owasp.html.PolicyFactory; import org.owasp.html.Sanitizers;
    private static final PolicyFactory POLICY_FACTORY = Sanitizers.FORMATTING.and(Sanitizers.LINKS);

    @PostMapping("/crear")
    public String crearIngreso(@ModelAttribute Ingresos ingreso, @ModelAttribute Usuarios usuarios, @ModelAttribute Medicos medicos, Model model){
        // Asigna y establece la hora de creación
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        ingreso.setIngresoCreado(currentDateTime);

        ingreso.setUsuarios(usuarios);
        ingreso.setMedicos(medicos);

        //Sanitizar inputs
        String sanitizarAlergias = POLICY_FACTORY.sanitize(ingreso.getAlergias()); ingreso.setAlergias(sanitizarAlergias);
        String sanitizarObservaciones = POLICY_FACTORY.sanitize(ingreso.getObservaciones()); ingreso.setObservaciones(sanitizarObservaciones);
        String sanitizarDiagnostico = POLICY_FACTORY.sanitize(ingreso.getDiagnostico()); ingreso.setDiagnostico(sanitizarDiagnostico);

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
        List<Usuarios> usuarios = usuariosServicios.findAll();
        List<Medicos> medicos = medicosServicios.findAll();

        model.addAttribute("usuarios", usuarios);
        model.addAttribute("medicos", medicos);
        model.addAttribute("ingreso", ingreso);
        session.setAttribute("creado_dia", ingreso.getIngresoCreado());
        return "/views/Ingresos/detalle-ingreso";
    }

    /* Se actualiza poniendo la hora de forma automática*/
    // Actualizar un médico (POST)
    @PostMapping("/actualizar/{id}")
    public String actualizarMedico(@PathVariable("id") Long id, @ModelAttribute("ingreso") Ingresos ingreso, BindingResult result, Model model, HttpSession session) {
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        ingreso.setIngresoModificado(currentDateTime);
        LocalDateTime ingresoCreado = (LocalDateTime) session.getAttribute("creado_dia");
        ingreso.setIngresoCreado(ingresoCreado);

        Ingresos existingIngreso = ingresosServicios.findById(id);
        ingreso.setMedicos(existingIngreso.getMedicos());
        ingreso.setUsuarios(existingIngreso.getUsuarios());

        //Sanitizar inputs
        String sanitizarAlergias = POLICY_FACTORY.sanitize(ingreso.getAlergias()); ingreso.setAlergias(sanitizarAlergias);
        String sanitizarObservaciones = POLICY_FACTORY.sanitize(ingreso.getObservaciones()); ingreso.setObservaciones(sanitizarObservaciones);
        String sanitizarDiagnostico = POLICY_FACTORY.sanitize(ingreso.getDiagnostico()); ingreso.setDiagnostico(sanitizarDiagnostico);

        ingresosServicios.save(ingreso);
        return "redirect:/ingresos/listado-ingresos";
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

    // Eliminar un médico por ID (DELETE)
    @PostMapping("/eliminar/{id}")
    public String eliminarMedico(@PathVariable Long id){
        ingresosServicios.deleteById(id);
        return "redirect:/ingresos/listado-ingresos";
    }
}