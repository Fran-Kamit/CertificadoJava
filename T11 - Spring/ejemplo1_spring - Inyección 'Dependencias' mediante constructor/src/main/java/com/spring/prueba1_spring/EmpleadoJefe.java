package com.spring.prueba1_spring;

import com.Empleados;

public class EmpleadoJefe implements Empleados{

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de jefe.\n";
    }

    private GestionDocumentos documentoNuevo;

    public EmpleadoJefe(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento() {
        return "Informe del JEFE: " + documentoNuevo.getDocumento();
    }
}