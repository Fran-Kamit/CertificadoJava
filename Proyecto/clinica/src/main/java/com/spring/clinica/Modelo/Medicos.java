package com.spring.clinica.Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")

public class Medicos {

    // ID clave principal que se recoge del ID de la tabla usuarios
    @Id
    @Column(name = "codigo_identificacion")
    private String codigoIdentificacion;

    @Column(name = "numeroColegiado")
    private int medicNumeroColegiado;

    @Column(name = "especialidad")
    private String medicEspecialidad;

    @Column(name = "cargo")
    private String medicCargo;

    @Column(name = "creado_dia")
    private LocalDateTime medicCreado;

    @Column(name = "modificado_dia")
    private LocalDateTime medicModificado;

    @OneToMany(mappedBy = "medicos", orphanRemoval = true)
    private List<Ingresos> ingresos = new ArrayList<>();

    // Constructores
    public Medicos() {
    }

    public Medicos(String codigoIdentificacion, int medicNumeroColegiado, String medicEspecialidad,
            String medicCargo, LocalDateTime medicCreado, LocalDateTime medicModificado, List<Ingresos> ingresos) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.medicNumeroColegiado = medicNumeroColegiado;
        this.medicEspecialidad = medicEspecialidad;
        this.medicCargo = medicCargo;
        this.medicCreado = medicCreado;
        this.medicModificado = medicModificado;
        this.ingresos = ingresos;
    }

    // Getters y setters
    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public int getMedicNumeroColegiado() {
        return medicNumeroColegiado;
    }

    public void setMedicNumeroColegiado(int medicNumeroColegiado) {
        this.medicNumeroColegiado = medicNumeroColegiado;
    }

    public String getMedicEspecialidad() {
        return medicEspecialidad;
    }

    public void setMedicEspecialidad(String medicEspecialidad) {
        this.medicEspecialidad = medicEspecialidad;
    }

    public String getMedicCargo() {
        return medicCargo;
    }

    public void setMedicCargo(String medicCargo) {
        this.medicCargo = medicCargo;
    }

    public LocalDateTime getMedicCreado() {
        return medicCreado;
    }

    public void setMedicCreado(LocalDateTime medicCreado) {
        this.medicCreado = medicCreado;
    }

    public LocalDateTime getMedicModificado() {
        return medicModificado;
    }

    public void setMedicModificado(LocalDateTime medicModificado) {
        this.medicModificado = medicModificado;
    }

    public List<Ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingresos> ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "Medicos [codigoIdentificacion=" + codigoIdentificacion
                + ", medicNumeroColegiado=" + medicNumeroColegiado + ", medicEspecialidad=" + medicEspecialidad
                + ", medicCargo=" + medicCargo + ", medicCreado=" + medicCreado + ", medicModificado=" + medicModificado
                + ", ingresos=" + ingresos + "]";
    }

}