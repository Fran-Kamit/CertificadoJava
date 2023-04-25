package com.spring.prueba1_spring;

public class EmpleadoJefe implements Empleados{

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de jefe.\n";
    }

    private GestionDocumentos documentoNuevo;

    public void setDocumentoNuevo(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento() {
        return "Informe del JEFE: " + documentoNuevo.getDocumento();
    }
}