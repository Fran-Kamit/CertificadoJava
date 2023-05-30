package com.spring.clinica.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.clinica.Modelo.Medicos;
import com.spring.clinica.Repositorios.MedicosRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class MedicosServicios {

    @Autowired
    private MedicosRepositorio medicosRepositorio;

    // Encontrar todos los médicos
    public List<Medicos> findAll() {
        return medicosRepositorio.findAll();
    }

    // Encontrar médicos por ID
    public Medicos findByCodigoIdentificacion(String id) {
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
        return medicosRepositorio.save(medico);// o cualquier otro manejo de errores que prefieras
    }
    

    // Actualizar un médico existente
    public Medicos update(String id, Medicos medicDetalles) {
        Medicos medico = findByCodigoIdentificacion(id);

        medico.setMedicNumeroColegiado(medicDetalles.getMedicNumeroColegiado());
        medico.setMedicEspecialidad(medicDetalles.getMedicEspecialidad());
        medico.setMedicCargo(medicDetalles.getMedicCargo());
        medico.setMedicCreado(medicDetalles.getMedicCreado());

        return medicosRepositorio.save(medico);
    }
    
    // Eliminar un médico
    public void deleteById(String id) {
        Medicos existeMedico = findByCodigoIdentificacion(id);
        medicosRepositorio.delete(existeMedico);
    }
}