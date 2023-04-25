package com.spring.prueba1_spring;

public class EmpleadoRaso implements Empleados {

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de empleado.\n";
    }

    private GestionDocumentos documentoNuevo;

    public void setDocumentoNuevo(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento() {
        return "Informe del EMPLEADO: " + documentoNuevo.getDocumento();
    }
}