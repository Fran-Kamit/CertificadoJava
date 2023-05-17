package com.spring.clinica.Controladores;

import com.spring.clinica.Modelo.Medicos;
import com.spring.clinica.Servicios.MedicosServicios;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/medicos")
public class MedicosControlador {

    @Autowired
    private MedicosServicios medicosServicios;
    
    // Obtener todos los médicos (GET)
    @GetMapping
    public ResponseEntity<List<Medicos>> getAllMedicos() {
        List<Medicos> medicos = medicosServicios.findAll();
        return new ResponseEntity<>(medicos, HttpStatus.OK);
    }

    // Obtener un médico por id (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Medicos> getMedicoById(@PathVariable UUID id) {
        Medicos medico = medicosServicios.findByCodigoIdentificacion(id);
        return new ResponseEntity<>(medico, HttpStatus.OK);
    }

    // Obtener médico por numeroColegiado (GET)
    @GetMapping("/numero-colegiado")
    public ResponseEntity<Medicos> getBicicletasPorMarca(@RequestParam int medicNumeroColegiado) {
        Medicos medico = medicosServicios.findBymedicNumeroColegiado(medicNumeroColegiado);
        return new ResponseEntity<>(medico, HttpStatus.OK);
    }

    //Obtener médico para editar en html
    @GetMapping("/detalle/{id}")
    public String verBicicletaDetalle(@PathVariable UUID id, Model model) {
        Medicos medico = medicosServicios.findByCodigoIdentificacion(id);
        model.addAttribute("medico", medico);
        return "/views/Medicos/detalle-medico";
    }

    // Crear un nuevo médico (POST)
    @PostMapping
    public ResponseEntity<Medicos> createMedico(@RequestBody Medicos medico) {
        Medicos nuevoMedico = medicosServicios.save(medico);
        return new ResponseEntity<>(nuevoMedico, HttpStatus.CREATED);
    }

    // Actualizar un médico (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Medicos> updateMedico(@PathVariable UUID id, @RequestBody Medicos medicDetalles) {
        Medicos actualizarMedico = medicosServicios.update(id, medicDetalles);
        return new ResponseEntity<>(actualizarMedico, HttpStatus.OK);
    }

    // Eliminar un médico por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedico(@PathVariable UUID id) {
        medicosServicios.delete(medicosServicios.findByCodigoIdentificacion(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Creando la interfaz web
    public MedicosControlador(MedicosServicios medicosServicio) {
        this.medicosServicios = medicosServicio;
    }

    @GetMapping("/listado-medicos")
    public String listarBicicletas(Model model) {
        List<Medicos> medicos =medicosServicios.findAll();
        model.addAttribute("medicos", medicos);
        model.addAttribute("medicos", new Medicos()); // Añade esta línea
        return "/views/Medicos/listado-medicos";
    }



}