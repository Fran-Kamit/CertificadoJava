package com.spring.ejemplo2;
import org.springframework.stereotype.Component;

@Component("Director")
public interface Empleados {
    public abstract String getResponsabilidades();
    public String getDocumento();
}