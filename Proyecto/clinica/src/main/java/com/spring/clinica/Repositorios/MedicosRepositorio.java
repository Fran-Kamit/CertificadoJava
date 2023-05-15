package com.spring.clinica.Repositorios;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.clinica.Modelo.Medicos;

public interface MedicosRepositorio extends JpaRepository<Medicos, UUID>{
    List<Medicos> findByusuarios(String usuarios);
    Optional<Medicos> findBycodigoIdentificacion(UUID codigoIdentificacion);
    Optional<Medicos> findBymedicNumeroColegiado(int medicNumeroColegiado);
}