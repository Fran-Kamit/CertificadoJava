package com.spring.clinica.Repositorios;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.clinica.Modelo.Medicos;

public interface MedicosRepositorio extends JpaRepository<Medicos, UUID>{
    Optional<Medicos> findByCodigoIdentificacion(String codigoIdentificacion);
    Optional<Medicos> findByMedicNumeroColegiado(String medicNumeroColegiado);
}