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

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/medicos")
public class MedicosControlador {

    @Autowired
    private UsuariosServicios usuariosServicios;
    @Autowired
    private MedicosServicios medicosServicios;
    
    /*Crear médico con fecha automática*/
    @PostMapping("/crear")
    public String crearMedico(@ModelAttribute Medicos medico, @RequestParam("usuarCodigoIdentificacion") String usuarCodigoIdentificacion, Model model) {
        medico.setCodigoIdentificacion(usuarCodigoIdentificacion);
        String nombre = "";
        String apellidos = "";
    
        // Buscar el usuario seleccionado por su código de identificación
        for (Usuarios usuario : usuariosServicios.findAll()) {
            if (usuario.getUsuarCodigoIdentificacion().toString().equals(usuarCodigoIdentificacion)) {
                nombre = usuario.getUsuarNombre();
                apellidos = usuario.getUsuarApellidos();
                break;
            }
        }
    
        medico.setNombreUsuario(nombre);
        medico.setApellidoUsuario(apellidos);

        // Asigna y establece la hora de creación
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        medico.setMedicCreado(currentDateTime);

        // Guarda el médico en la base de datos
        medicosServicios.save(medico);

        return "redirect:/medicos/listado-medicos";
    }

    @GetMapping("/crear-medico")
    public String showCreateMedicForm(Model model) {
        List<Usuarios> usuarios = usuariosServicios.findAll();
        List<Medicos> medicos = medicosServicios.findAll();

        usuarios.removeIf(usuario -> medicos.stream().anyMatch(medico -> medico.getCodigoIdentificacion().equals(usuario.getUsuarCodigoIdentificacion().toString())));

        model.addAttribute("usuarios", usuarios); // Agrega la lista de usuarios al modelo
        model.addAttribute("medico", new Medicos());     
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
    public ResponseEntity<Medicos> getcodigoIdentificacion(@PathVariable String id) {
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
    public String verMedicoDetalle(@PathVariable String id, Model model, HttpSession session) {
        Medicos medico = medicosServicios.findByCodigoIdentificacion(id);
        model.addAttribute("medico", medico);
        session.setAttribute("medic_creado_dia", medico.getMedicCreado());
        return "/views/Medicos/detalle-medico";
    }

    /* Se actualiza poniendo la hora de forma automática*/
    // Actualizar un médico (POST)
    @PostMapping("/actualizar/{id}")
    public String actualizarMedico(@ModelAttribute("medico") Medicos medico, @RequestParam("usuarCodigoIdentificacion") String usuarCodigoIdentificacion,@PathVariable String id, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            // Manejar errores de validación aquí
            return "views/Medicos/detalle-medico";
        }

        String nombre = "";
        String apellidos = "";
    
        // Buscar el usuario seleccionado por su código de identificación
        for (Usuarios usuario : usuariosServicios.findAll()) {
            if (usuario.getUsuarCodigoIdentificacion().toString().equals(usuarCodigoIdentificacion)) {
                nombre = usuario.getUsuarNombre();
                apellidos = usuario.getUsuarApellidos();
                break;
            }
        }
    
        medico.setNombreUsuario(nombre);
        medico.setApellidoUsuario(apellidos);

        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        medico.setMedicModificado(currentDateTime);
        medico.setCodigoIdentificacion(id);
        LocalDateTime medicCreado = (LocalDateTime) session.getAttribute("medic_creado_dia");
        medico.setMedicCreado(medicCreado);
        medicosServicios.save(medico);
        return "redirect:/medicos/listado-medicos";
    } 

    // Eliminar un médico por ID (DELETE)
    @PostMapping("/eliminar/{id}")
    public String eliminarMedico(@PathVariable String id){
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