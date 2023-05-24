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
    public Medicos findByCodigoIdentificacion(UUID id) {
        Optional<Medicos> medico = medicosRepositorio.findByCodigoIdentificacion(id);
        if (medico.isPresent()) {
            return medico.get();
        } else {
            throw new RuntimeException("Médico no encontrado con el ID: " + id);
        }
    }

    // Encontrar un médico por numeroColegiado
    public Medicos findBymedicNumeroColegiado(int medicNumeroColegiado) {
        Optional<Medicos> medico = medicosRepositorio.findByMedicNumeroColegiado(medicNumeroColegiado);
        if (medico.isPresent()) {
            return medico.get();
        } else {
            throw new RuntimeException("Médico no encontrado con el número de colegiado: " + medicNumeroColegiado);
        }
    }

    // Guardar un médico
    public Medicos save(Medicos medico) {
        return medicosRepositorio.save(medico);
    }

    // Actualizar un médico existente
    public Medicos update(UUID uuid, Medicos medicDetalles) {
        Medicos medico = findByCodigoIdentificacion(uuid);
        
        medico.setUsuarios(medicDetalles.getUsuarios());
        medico.setMedicNumeroColegiado(medicDetalles.getMedicNumeroColegiado());
        medico.setMedicEspecialidad(medicDetalles.getMedicEspecialidad());
        medico.setMedicCargo(medicDetalles.getMedicCargo());
        medico.setMedicCreado(medicDetalles.getMedicCreado());

        return medicosRepositorio.save(medico);
    }
    
    // Eliminar un médico
    public void deleteById(UUID id) {
        Medicos existeMedico = findByCodigoIdentificacion(id);
        medicosRepositorio.delete(existeMedico);
    }
}