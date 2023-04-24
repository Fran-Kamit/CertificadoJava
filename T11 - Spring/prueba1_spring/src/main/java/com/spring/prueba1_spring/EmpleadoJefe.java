package com.spring.prueba1_spring;

import com.Empleados;

public class EmpleadoJefe implements Empleados{

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de jefe.\n";
    }
/***********************************************************/
    private GestionDocumentos documentoNuevo;

    public EmpleadoJefe(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento() {
        return "Informe del JEFE: " + documentoNuevo.getDocumento();
    }
/** 7.C *****************************************************/
    private String emailDepartamental;

    public String getEmailDepartamental() {
        return emailDepartamental;
    }

    public void setEmailDepartamental(String email) {
        this.emailDepartamental = email;
    }

    private String empresa;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}