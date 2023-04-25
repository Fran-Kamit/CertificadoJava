package com.spring.prueba1_spring;

public class EmpleadoDirector implements Empleados{

    public EmpleadoDirector(){
    }

    @Override
    public String getResponsabilidades() {
        return "responsabilidades de director.\n";
    } 
/***********************************************************/
    private GestionDocumentos documentoNuevo;

    public EmpleadoDirector(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public String getDocumento() {
        return "Informe del DIRECTOR: " + documentoNuevo.getDocumento();
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

    /** 7- Ciclo vida BEANS **************/
    
    /*Método Init Ciclo de Vida */
    public void metodoInicioPrueba(){
        System.out.println("Puedo añadir todas las tareas que quiera antes de iniciar el beans, de momento solo muestro un mensaje.");
    }

    /* Método destroy para ejecutar tareas después de haber usado el bean. */
    public void metodoDestruccionPrueba() {
        System.out.println("Aunque puedo añadir todas las tareas que quiera en el DESTROY para que se ejecuten DESPUÉS DE APAGAR el beans, de momento solo muestro un mensaje.");
    }
}