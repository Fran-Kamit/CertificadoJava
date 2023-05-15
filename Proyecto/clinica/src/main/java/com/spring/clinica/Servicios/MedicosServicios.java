package com.spring.clinica.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.clinica.Modelo.Medicos;
import com.spring.clinica.Repositorios.MedicosRepositorio;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MedicosServicios {

    @Autowired
    private MedicosRepositorio medicosRepositorio;

    // Encontrar todos los médicos
    public List<Medicos> findAll() {
        return medicosRepositorio.findAll();
    }

    // Encontrar médicos por ID
    public Medicos findBycodigoIdentificacion(UUID id) {
        Optional<Medicos> medico = medicosRepositorio.findBycodigoIdentificacion(id);
        if (medico.isPresent()) {
            return medico.get();
        } else {
            throw new RuntimeException("Médico no encontrado con el ID: " + id);
        }
    }

    // Encontrar un médico por numeroColegiado
    public Medicos findByName(int medicNumeroColegiado) {
        Optional<Medicos> medico = medicosRepositorio.findBymedicNumeroColegiado(medicNumeroColegiado);
        if (medico.isPresent()) {
            return medico.get();
        } else {
            throw new RuntimeException("Médico no encontrado con el número de colegiado: " + medicNumeroColegiado);
        }
    }

    // Guardar un usuario
    public Medicos save(Medicos medico) {
        return medicosRepositorio.save(medico);
    }

    // Actualizar un usuario existente
    public Medicos update(UUID uuid, Medicos medicDetalles) {
        Medicos medico = findBycodigoIdentificacion(uuid);
        medico.setUsuarios(medicDetalles.getUsuarios());
        medico.setMedicNumeroColegiado(medicDetalles.getMedicNumeroColegiado());
        medico.setMedicEspecialidad(medicDetalles.getMedicEspecialidad());
        medico.setMedicCargo(medicDetalles.getMedicCargo());

        return medicosRepositorio.save(medico);
    }
    
    // Eliminar un médico
    public void delete(Medicos medico) {
        medicosRepositorio.delete(medico);
    }
}