package com.spring.prueba1_spring;

public class EmpleadoDirector implements Empleados {

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de director.\n";
    } 

    private GestionDocumentos documentoNuevo;

    public EmpleadoDirector(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento() {
        return "Informe del DIRECTOR: " + documentoNuevo.getDocumento();
    }
}