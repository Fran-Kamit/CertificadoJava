package com.spring.clinica.Controladores;

import com.spring.clinica.Modelo.Medicos;
import com.spring.clinica.Servicios.MedicosServicios;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/medicos")
public class MedicosControlador {

    @Autowired
    private MedicosServicios medicosServicios;
    
    // Obtener todos los médicos
    @GetMapping
    public ResponseEntity<List<Medicos>> getAllMedicos() {
        List<Medicos> medicos = medicosServicios.findAll();
        return new ResponseEntity<>(medicos, HttpStatus.OK);
    }

    // Obtener un médico por id
    @GetMapping("/{id}")
    public ResponseEntity<Medicos> getMedicoById(@PathVariable UUID id) {
        Medicos medico = medicosServicios.findBycodigoIdentificacion(id);
        return new ResponseEntity<>(medico, HttpStatus.OK);
    }

    // Crear un nuevo médico
    @PostMapping
    public ResponseEntity<Medicos> createMedico(@RequestBody Medicos medico) {
        Medicos nuevoMedico = medicosServicios.save(medico);
        return new ResponseEntity<>(nuevoMedico, HttpStatus.CREATED);
    }

    // Actualizar un médico
    @PutMapping("/{id}")
    public ResponseEntity<Medicos> updateMedico(@PathVariable UUID id, @RequestBody Medicos medicDetalles) {
        Medicos actualizarMedico = medicosServicios.update(id, medicDetalles);
        return new ResponseEntity<>(actualizarMedico, HttpStatus.OK);
    }

    // Eliminar un médico
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedico(@PathVariable UUID id) {
        medicosServicios.delete(medicosServicios.findBycodigoIdentificacion(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}