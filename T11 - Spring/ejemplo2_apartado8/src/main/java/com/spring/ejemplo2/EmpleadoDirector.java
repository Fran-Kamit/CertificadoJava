package com.spring.ejemplo2;
import org.springframework.stereotype.Component;

@Component("Director")
public class EmpleadoDirector implements Empleados {
    public EmpleadoDirector(){
    }

    public String getResponsabilidades() {
        return "\nDirige los departamentos y objetivos de la empresa";
    }

    @Override
    public String getDocumento() {
        return "\nDocumento Generado por el Director";
    }
}