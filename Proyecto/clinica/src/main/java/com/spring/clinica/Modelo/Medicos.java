package com.spring.clinica.Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")

public class Medicos implements Serializable{

    //ID clave principal que se recoge del ID de la tabla usuarios
    @Id
    @Column(name = "codigo_identificacion")
    private UUID codigoIdentificacion;

    @MapsId
    @OneToOne
    @JoinColumn(name = "codigo_identificacion")
    private Usuarios usuarios;
    ////////////////

    @Column(name = "numeroColegiado")
    private int medicNumeroColegiado;

    @Column(name = "especialidad")
    private String medicEspecialidad;

    @Column(name = "cargo")
    private String medicCargo;

    @OneToMany(mappedBy = "medicos", orphanRemoval = true)
    private List<Ingresos> ingresos = new ArrayList<>();

    //Constructores
    public Medicos(){
    }

    public Medicos(Usuarios usuarios, int medicNumeroColegiado, String medicEspecialidad, String medicCargo) {
        this.usuarios = usuarios;
        this.medicNumeroColegiado = medicNumeroColegiado;
        this.medicEspecialidad = medicEspecialidad;
        this.medicCargo = medicCargo;
    }

    //Getters y setters
    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
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

    //toString
    @Override
    public String toString() {
        return "Medicos [usuarios=" + usuarios + ", medicNumeroColegiado="
        + medicNumeroColegiado + ", medicEspecialidad=" + medicEspecialidad
        + ", medicCargo=" + medicCargo + "]";
    }
}