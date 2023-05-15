package com.spring.clinica.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.clinica.Modelo.Ingresos;
import com.spring.clinica.Repositorios.IngresosRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class ingresosServicios {

    @Autowired
    private IngresosRepositorio ingresosRepositorio;
    
}