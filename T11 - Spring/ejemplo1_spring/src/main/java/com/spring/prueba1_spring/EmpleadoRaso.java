package com.spring.prueba1_spring;

public class EmpleadoRaso implements Empleados {

    public EmpleadoRaso(){
    }

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de empleado.\n";
    }
/***********************************************************/
    private GestionDocumentos documentoNuevo;

    public EmpleadoRaso(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento() {
        return "Informe del EMPLEADO: " + documentoNuevo.getDocumento();
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