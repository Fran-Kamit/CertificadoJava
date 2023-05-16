package com.spring.clinica.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.clinica.Modelo.Ingresos;
import com.spring.clinica.Repositorios.IngresosRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class IngresosServicios {

    @Autowired
    private IngresosRepositorio ingresosRepositorio;
    
    //Encontrar todos los ingresos
    public List<Ingresos> findAll() {
        return ingresosRepositorio.findAll();
    }

    public Ingresos findById(Long id) {
        Optional<Ingresos> ingresosOpcional = ingresosRepositorio.findById(id);
        if (ingresosOpcional.isPresent()) {
            return ingresosOpcional.get();
        } else {
            throw new RuntimeException("Ingreso no encontrado con el ID: " + id);
        }
    } 

    //Guardar un ingreso
    public Ingresos save(Ingresos ingresos) {
        return ingresosRepositorio.save(ingresos);
    }

    // Actualizar un ingreso existente
    public Ingresos update(Long id, Ingresos ingresoDetalles) {
        Ingresos ingreso = findById(id);
        
        ingreso.setUsuarios(ingresoDetalles.getUsuarios());
        ingreso.setMedicos(ingresoDetalles.getMedicos());
        ingreso.setFechaIngreso(ingresoDetalles.getFechaIngreso());
        ingreso.setFechaAlta(ingresoDetalles.getFechaAlta());
        ingreso.setNumeroPlanta(ingresoDetalles.getNumeroPlanta());
        ingreso.setNumeroHabitacion(ingresoDetalles.getNumeroHabitacion());
        ingreso.setNumeroCama(ingresoDetalles.getNumeroCama());
        ingreso.setAlergias(ingresoDetalles.getAlergias());
        ingreso.setObservaciones(ingresoDetalles.getObservaciones());
        ingreso.setCoste(ingresoDetalles.getCoste());
        ingreso.setDiagnostico(ingresoDetalles.getDiagnostico());

        return ingresosRepositorio.save(ingreso);
    }

    //Eliminar un ingreso
    public void deleteById(Long id) {
        Ingresos ingreso = findById(id);
        ingresosRepositorio.delete(ingreso);
    }
}