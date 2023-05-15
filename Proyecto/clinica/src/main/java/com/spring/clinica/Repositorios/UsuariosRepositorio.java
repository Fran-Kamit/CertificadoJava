package com.spring.clinica.Repositorios;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.clinica.Modelo.Usuarios;

public interface UsuariosRepositorio extends JpaRepository<Usuarios, UUID>{
    List<Usuarios> findByUsuarNombre(String usuarNombre);
    Optional<Usuarios> findByusuarCodigoIdentificacion(UUID usuarCodigoIdentificacion);
}