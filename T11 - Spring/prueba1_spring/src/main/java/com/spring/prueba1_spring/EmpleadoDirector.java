package com.spring.prueba1_spring;

import com.Empleados;

public class EmpleadoDirector implements Empleados{

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de director.\n";
    }
}