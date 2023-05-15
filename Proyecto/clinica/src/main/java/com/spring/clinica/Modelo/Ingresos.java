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
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "ingresos")
public class Ingresos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroIngreso")
    private Long idnumeroIngreso;

    @ManyToOne
    @JoinColumn(name = "usuarios_codigo_identificacion", referencedColumnName = "codigo_identificacion")
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "codigo_identificacion", nullable = false)
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

    //Contructores
    public Ingresos(){
    }

    public Ingresos(Long idnumeroIngreso, Usuarios usuarios, Medicos medicos, LocalDate fechaIngreso,
            LocalDate fechaAlta, int numeroPlanta, int numeroHabitacion, int numeroCama, String alergias,
            String observaciones, double coste, String diagnostico) {
        this.idnumeroIngreso = idnumeroIngreso;
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
    }

    //Getters y setters
    public Long getIdnumeroIngreso() {
        return idnumeroIngreso;
    }

    public void setIdnumeroIngreso(Long idnumeroIngreso) {
        this.idnumeroIngreso = idnumeroIngreso;
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

    //toString
    @Override
    public String toString() {
        return "Ingresos [idnumeroIngreso=" + idnumeroIngreso + ", usuarios=" + usuarios + ", medicos=" + medicos
                + ", fechaIngreso=" + fechaIngreso + ", fechaAlta=" + fechaAlta + ", numeroPlanta=" + numeroPlanta
                + ", numeroHabitacion=" + numeroHabitacion + ", numeroCama=" + numeroCama + ", alergias=" + alergias
                + ", observaciones=" + observaciones + ", coste=" + coste + ", diagnostico=" + diagnostico + "]";
    }
}