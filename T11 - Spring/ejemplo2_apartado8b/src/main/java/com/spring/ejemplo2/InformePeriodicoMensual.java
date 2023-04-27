package com.spring.ejemplo2;

import org.springframework.stereotype.Component;

@Component
public class InformePeriodicoMensual implements CrearDocumentos{
    
    @Override
    public String getDocumento() {
        return "\nInforme Periódico Mensual.";
    }
}