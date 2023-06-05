package com.spring.clinica.Modelo;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;


@Entity
@Table(name = "ingresos")
public class Ingresos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroIngreso")
    private Long idNumeroIngreso;

    @ManyToOne
    @JoinColumn(name = "usuarios_codigo_identificacion", referencedColumnName = "codigo_identificacion")
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "medicos_codigo_identificacion", referencedColumnName = "codigo_identificacion", nullable = false)
    private Medicos medicos;

    @Column(name = "fecha_ingreso")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaIngreso;

    @Column(name = "fecha_alta")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaAlta;

    @Column(name = "numero_planta")
    private int numeroPlanta;

    @Column(name = "numero_habitacion")
    private int numeroHabitacion;

    @Column(name = "numero_cama")
    private int numeroCama;

    @Column(name = "alergias")
    private String alergias;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "coste")
    private double coste;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "creado_dia")
    private LocalDateTime ingresoCreado;

    @Column(name = "modificado_dia")
    private LocalDateTime ingresoModificado;

    //Contructores
    public Ingresos(){
    }

    public Ingresos(Long idNumeroIngreso, Usuarios usuarios, Medicos medicos, LocalDate fechaIngreso,
            LocalDate fechaAlta, int numeroPlanta, int numeroHabitacion, int numeroCama, String alergias,
            String observaciones, double coste, String diagnostico, LocalDateTime ingresoCreado,
            LocalDateTime ingresoModificado) {
        this.idNumeroIngreso = idNumeroIngreso;
        this.usuarios = usuarios;
        this.medicos = medicos;
        this.fechaIngreso = fechaIngreso;
        this.fechaAlta = fechaAlta;
        this.numeroPlanta = numeroPlanta;
        this.numeroHabitacion = numeroHabitacion;
        this.numeroCama = numeroCama;
        this.alergias = alergias;
        this.observaciones = observaciones;
        this.coste = coste;
        this.diagnostico = diagnostico;
        this.ingresoCreado = ingresoCreado;
        this.ingresoModificado = ingresoModificado;
    }

    @Component
    public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {
    
        private static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm";
    
        @Override
        public LocalDateTime convert(String source) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return LocalDateTime.parse(source, formatter);
        }
    }

    //Getters y setters

    public Long getIdNumeroIngreso() {
        return idNumeroIngreso;
    }

    public void setIdNumeroIngreso(Long idNumeroIngreso) {
        this.idNumeroIngreso = idNumeroIngreso;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public void setMedicos(Medicos medicos) {
        this.medicos = medicos;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public LocalDateTime getIngresoCreado() {
        return ingresoCreado;
    }

    public void setIngresoCreado(LocalDateTime ingresoCreado) {
        this.ingresoCreado = ingresoCreado;
    }

    public LocalDateTime getIngresoModificado() {
        return ingresoModificado;
    }

    public void setIngresoModificado(LocalDateTime ingresoModificado) {
        this.ingresoModificado = ingresoModificado;
    }

    //toString
    @Override
    public String toString() {
        return "Ingresos [idNumeroIngreso=" + idNumeroIngreso + ", usuarios=" + usuarios + ", medicos=" + medicos
                + ", fechaIngreso=" + fechaIngreso + ", fechaAlta=" + fechaAlta + ", numeroPlanta=" + numeroPlanta
                + ", numeroHabitacion=" + numeroHabitacion + ", numeroCama=" + numeroCama + ", alergias=" + alergias
                + ", observaciones=" + observaciones + ", coste=" + coste + ", diagnostico=" + diagnostico
                + ", ingresoCreado=" + ingresoCreado + ", ingresoModificado=" + ingresoModificado + "]";
    }    
}