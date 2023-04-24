package com.spring.prueba1_spring;

import com.Empleados;

public class EmpleadoRaso implements Empleados {

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de empleado.\n";
    }

    private GestionDocumentos documentoNuevo;

    public EmpleadoRaso(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento() {
        return "Informe del EMPLEADO: " + documentoNuevo.getDocumento();
    }
}