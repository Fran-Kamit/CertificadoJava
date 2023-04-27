package com.spring.ejemplo2;

import org.springframework.context.annotation.Bean;


public class EmpleadoRaso implements Empleados {

    public EmpleadoRaso(){
    }

    @Bean
    public Empleados empleadoRaso() {
        EmpleadoRaso empleadoRaso = new EmpleadoRaso(InformeDiarioRaso());
        return empleadoRaso;
    }


    private CrearDocumentos InformeDiarioRaso() {
        return null;
    }

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de empleado.\n";
    }
/***********************************************************/
    private CrearDocumentos documentoNuevo;

    public EmpleadoRaso(CrearDocumentos documentoNuevo) {
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