package com.spring.clinica.Controladores;

import com.spring.clinica.Modelo.Medicos;
import com.spring.clinica.Modelo.Usuarios;
import com.spring.clinica.Servicios.MedicosServicios;
import com.spring.clinica.Servicios.UsuariosServicios;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/medicos")
public class MedicosControlador {

    @Autowired
    private UsuariosServicios usuariosServicios;
    private MedicosServicios medicosServicios;
    


    /*Crear médico con fecha automática*/
    @PostMapping("/crear")
    public String crearMedico(@ModelAttribute Medicos medico, @RequestParam UUID usuarios) {
        Usuarios usuario = usuariosServicios.findByusuarCodigoIdentificacion(usuarios);
        medico.setUsuarios(usuario);
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        medico.setMedicCreado(currentDateTime);
        medicosServicios.save(medico);
        return "redirect:/medicos/listado-medicos";
    }

    @GetMapping("/crear-medico")
    public String showCreateMedicForm(Model model) {
        Medicos medico = new Medicos();
        model.addAttribute("medico", medico);

        List<Usuarios> usuarios = usuariosServicios.findAll();
        model.addAttribute("usuarios", usuarios); // Agrega la lista de usuarios al modelo
        return "/views/Medicos/crear-medico";
    }
    
    // Obtener todos los médicos (GET)
    @GetMapping
    public ResponseEntity<List<Medicos>> getAllMedicos() {
        List<Medicos> medicos = medicosServicios.findAll();
        return new ResponseEntity<>(medicos, HttpStatus.OK);
    }

    // Obtener un médico por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Medicos> getcodigoIdentificacion(@PathVariable UUID id) {
        Medicos medico = medicosServicios.findByCodigoIdentificacion(id);
        return new ResponseEntity<>(medico, HttpStatus.OK);
    }

    // Obtener médico por numeroColegiado (GET)
    @GetMapping("/numero-colegiado")
    public ResponseEntity<Medicos> getMedicNumeroColegiado(@RequestParam int medicNumeroColegiado) {
        Medicos medico = medicosServicios.findBymedicNumeroColegiado(medicNumeroColegiado);
        return new ResponseEntity<>(medico, HttpStatus.OK);
    }

    //Obtener médico para editar en html
    @GetMapping("/detalle/{id}")
    public String verMedicoDetalle(@PathVariable UUID id, Model model, HttpSession session) {
        Medicos medico = medicosServicios.findByCodigoIdentificacion(id);
        model.addAttribute("medico", medico);
        session.setAttribute("medic_creado_dia", medico.getMedicCreado());
        return "/views/Medicos/detalle-medico";
    }

    /* Se actualiza poniendo la hora de forma automática*/
    // Actualizar un médico (POST)
    @PostMapping("/actualizar/{id}")
    public String actualizarMedico(@ModelAttribute("medico") Medicos medico, @PathVariable UUID id, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            // Manejar errores de validación aquí
            return "views/Medicos/detalle-medico";
        }
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        medico.setMedicModificado(currentDateTime);
        /*medico.setcodigoIdentificacion(id);*/
        LocalDateTime medicCreado = (LocalDateTime) session.getAttribute("medic_creado_dia");
        medico.setMedicCreado(medicCreado);
        medicosServicios.save(medico);
        return "redirect:/medicos/listado-medicos";
    } 

    // Eliminar un médico por ID (DELETE)
    @PostMapping("/eliminar/{id}")
    public String eliminarMedico(@PathVariable UUID id){
        medicosServicios.deleteById(id);
        return "redirect:/medicos/listado-medicos";
    }

    // Creando la interfaz web
    public MedicosControlador(MedicosServicios medicosServicio) {
        this.medicosServicios = medicosServicio;
    }

    //Obtener listado de médicos
    @GetMapping("/listado-medicos")
    public String listarMedicos(Model model) {
        List<Medicos> medicos = medicosServicios.findAll();
        model.addAttribute("medicos", medicos);
        return "/views/Medicos/listado-medicos";
    }
}