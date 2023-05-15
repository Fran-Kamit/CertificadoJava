package com.spring.clinica.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.clinica.Modelo.Ingresos;

public interface IngresosRepositorio extends JpaRepository<Ingresos, Long>{
}