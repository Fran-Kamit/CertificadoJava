package com.spring.ejemplo2;
import org.springframework.stereotype.Component;

@Component("Director")
public class InformePeriodicoAnual implements CrearDocumentos{

    @Override
    public String getDocumento() {
        return "Informe Periodico Anual";
    }
}