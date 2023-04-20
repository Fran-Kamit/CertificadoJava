package com.spring.prueba1_spring;

import com.Empleados;

public class EmpleadoJefe implements Empleados{

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de jefe.\n";
    }
}