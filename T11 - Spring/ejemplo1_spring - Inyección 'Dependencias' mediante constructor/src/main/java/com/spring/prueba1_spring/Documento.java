package com.spring.prueba1_spring;

public class Documento implements GestionDocumentos{

    @Override
    public String getDocumento() {
        return "Presentación del Documento";
    }

}