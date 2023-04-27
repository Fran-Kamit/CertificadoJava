package com.spring.ejemplo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.ejemplo2")
public class ArchivoConfiguracion {
    @Bean
    public CrearDocumentos informePersonalizadoStuff() {
        return new InformePeriodicoMensual();
    }


    public CrearDocumentos informePeriodicoMensual() {
        return new InformePeriodicoMensual();
    }

}