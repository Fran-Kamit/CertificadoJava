package com.spring.ejemplo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class EmpleadoDirector implements Empleados {

    private CrearDocumentos documentoDirector;

    public EmpleadoDirector (@Qualifier("informePeriodicoMensual") CrearDocumentos documentoDirector){
        this.documentoDirector = documentoDirector;
        System.out.println(this.documentoDirector);
    }

    public String getResponsabilidades() {
        return "\nDirige los departamentos y objetivos de la empresa.";
    }

    @Override
    public String getDocumento() {
        return this.documentoDirector.getDocumento();
    }

    @PostConstruct
    public void metodoPostConstruct() {
        System.out.println("\nEjecutando el método PostConstruct. Ejecuta tareas justo cuando se construye el bean, antes de que el bean esté disponible. Por ejemplo para activar servicios antes de que el bean esté listo.");
    }

    @PreDestroy
    public void metodoPreDestroy() {
        System.out.println("\nEjecutando el método PreDestroy. Ejecuta tareas después de que el bean haya sido utilizado y destruido. Por ejemplo para liberar recursos, cerrar conexiones, etc.\n");
    }
}