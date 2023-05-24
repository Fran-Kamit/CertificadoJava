package com.spring.clinica.Modelo;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id // clave primaria de la entidad (en este caso, la clase Personas)
    @GeneratedValue(generator = "UUID") // Valor de este campo se generará automáticamente utilizando "UUID"
    @GenericGenerator(
        name = "UUID", // Define el nombre del generador genérico, que se utilizará en la anotación @GeneratedValue
        strategy = "org.hibernate.id.UUIDGenerator" // Define la estrategia de generación de UUIDs que se utilizará (en este caso, la estrategia de generación de UUID de Hibernate)
    )
    @Type(type="org.hibernate.type.UUIDBinaryType") // Especifica el tipo de mapeo de Hibernate para este campo (en este caso, un tipo binario de UUID)
    @Column(name = "codigo_identificacion", columnDefinition = "BINARY(16)", updatable = false, nullable = false, unique = true) // Proporciona información adicional sobre cómo mapear este campo a una columna de la base de datos
    private UUID usuarCodigoIdentificacion; // Declara la variable 'id' de tipo UUID  

    @Column(name = "numSS")
    private long usuarNumSS;

    @Column(name = "dni")
    private String usuarDni;

    @Column(name = "nombre")
    private String usuarNombre;

    @Column(name = "apellidos")
    private String usuarApellidos;

    @Column(name = "genero")
    private String usuarGenero;

    @Column(name = "fechaNacimiento")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate usuarFechaNacimiento;

    @Column(name = "domicilio")
    private String usuarDomicilio;

    @Column(name = "poblacion")
    private String usuarPoblacion;

    @Column(name = "provincia")
    private String usuarProvincia;

    @Column(name = "pais")
    private String usuarPais;

    @Column(name = "codigo_postal")
    private int usuarCodigoPostal;

    @Column(name = "telefono")
    private int usuarTelefono;

    @Email
    @Column(name = "email")
    private String usuarEmail;

    @Column(name = "consentimientoDatos")
    private boolean usuarConsentimientoDatos;

    @Column(name = "creado_dia")
    private LocalDateTime usuarCreado;

    @Column(name = "modificado_dia")
    private LocalDateTime usuarModificado;

    @OneToMany(mappedBy = "usuarios", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingresos> ingresos = new ArrayList<>();

    @OneToOne(mappedBy = "usuarios", cascade = CascadeType.ALL, orphanRemoval = true)
    private Medicos medicos;

    //Constructores
    public Usuarios() {
    }

    public Usuarios(UUID usuarCodigoIdentificacion, long usuarNumSS, String usuarDni, String usuarNonmbre, String usuarApellidos,
    String usuarGenero, LocalDate usuarFechaNacimiento, String usuarDomicilio, String usuarPoblacion, String usuarProvincia,
    String usuarPais, int usuarCodigoPostal, int usuarTelefono, @Email String usuarEmail, boolean usuarConsentimientoDatos,
    LocalDateTime usuarCreado, LocalDateTime usuarModificado) {
    this.usuarCodigoIdentificacion = usuarCodigoIdentificacion;
    this.usuarNumSS = usuarNumSS;
    this.usuarDni = usuarDni;
    this.usuarNombre = usuarNonmbre;
    this.usuarApellidos = usuarApellidos;
    this.usuarGenero = usuarGenero;
    this.usuarFechaNacimiento = usuarFechaNacimiento;
    this.usuarDomicilio = usuarDomicilio;
    this.usuarPoblacion = usuarPoblacion;
    this.usuarProvincia = usuarProvincia;
    this.usuarPais = usuarPais;
    this.usuarCodigoPostal = usuarCodigoPostal;
    this.usuarTelefono = usuarTelefono;
    this.usuarEmail = usuarEmail;
    this.usuarConsentimientoDatos = usuarConsentimientoDatos;
    this.usuarCreado = usuarCreado;
    this.usuarModificado = usuarModificado;
}

    //Métodos
    @Component
    public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {
    
        private static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    
        @Override
        public LocalDateTime convert(String source) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return LocalDateTime.parse(source, formatter);
        }
    }
    
    

    // Getters y setters

    public UUID getUsuarCodigoIdentificacion() {
        return usuarCodigoIdentificacion;
    }

    public void setUsuarCodigoIdentificacion(UUID usuarCodigoIdentificacion) {
        this.usuarCodigoIdentificacion = usuarCodigoIdentificacion;
    }

    public long getUsuarNumSS() {
        return usuarNumSS;
    }

    public void setUsuarNumSS(long usuarNumSS) {
        this.usuarNumSS = usuarNumSS;
    }

    public String getUsuarDni() {
        return usuarDni;
    }

    public void setUsuarDni(String usuarDni) {
        this.usuarDni = usuarDni;
    }

    public String getUsuarNombre() {
        return usuarNombre;
    }

    public void setUsuarNombre(String usuarNombre) {
        this.usuarNombre = usuarNombre;
    }

    public String getUsuarApellidos() {
        return usuarApellidos;
    }

    public void setUsuarApellidos(String usuarApellidos) {
        this.usuarApellidos = usuarApellidos;
    }

    public String getUsuarGenero() {
        return usuarGenero;
    }

    public void setUsuarGenero(String usuarGenero) {
        this.usuarGenero = usuarGenero;
    }

    public LocalDate getUsuarFechaNacimiento() {
        return usuarFechaNacimiento;
    }

    public void setUsuarFechaNacimiento(LocalDate usuarFechaNacimiento) {
        this.usuarFechaNacimiento = usuarFechaNacimiento;
    }

    public String getUsuarDomicilio() {
        return usuarDomicilio;
    }

    public void setUsuarDomicilio(String usuarDomicilio) {
        this.usuarDomicilio = usuarDomicilio;
    }

    public String getUsuarPoblacion() {
        return usuarPoblacion;
    }

    public void setUsuarPoblacion(String usuarPoblacion) {
        this.usuarPoblacion = usuarPoblacion;
    }

    public String getUsuarProvincia() {
        return usuarProvincia;
    }

    public void setUsuarProvincia(String usuarProvincia) {
        this.usuarProvincia = usuarProvincia;
    }

    public String getUsuarPais() {
        return usuarPais;
    }

    public void setUsuarPais(String usuarPais) {
        this.usuarPais = usuarPais;
    }

    public int getUsuarCodigoPostal() {
        return usuarCodigoPostal;
    }

    public void setUsuarCodigoPostal(int usuarCodigoPostal) {
        this.usuarCodigoPostal = usuarCodigoPostal;
    }

    public int getUsuarTelefono() {
        return usuarTelefono;
    }

    public void setUsuarTelefono(int usuarTelefono) {
        this.usuarTelefono = usuarTelefono;
    }

    public String getUsuarEmail() {
        return usuarEmail;
    }

    public void setUsuarEmail(String usuarEmail) {
        this.usuarEmail = usuarEmail;
    }

    public boolean isUsuarConsentimientoDatos() {
        return usuarConsentimientoDatos;
    }

    public void setUsuarConsentimientoDatos(boolean usuarConsentimientoDatos) {
        this.usuarConsentimientoDatos = usuarConsentimientoDatos;
    }

    public LocalDateTime getUsuarCreado() {
        return usuarCreado;
    }

    public void setUsuarCreado(LocalDateTime usuarCreado) {
        this.usuarCreado = usuarCreado;
    }

    public LocalDateTime getUsuarModificado() {
        return usuarModificado;
    }

    public void setUsuarModificado(LocalDateTime usuarModificado) {
        this.usuarModificado = usuarModificado;
    }

    public List<Ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingresos> ingresos) {
        this.ingresos = ingresos;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public void setMedicos(Medicos medicos) {
        this.medicos = medicos;
    }

    //toString
    @Override
    public String toString() {
        return "Usuarios [usuarCodigoIdentificacion=" + usuarCodigoIdentificacion + ", usuarNumSS=" + usuarNumSS
                + ", usuarDni=" + usuarDni + ", usuarNombre=" + usuarNombre + ", usuarApellidos=" + usuarApellidos
                + ", usuarGenero=" + usuarGenero + ", usuarFechaNacimiento=" + usuarFechaNacimiento
                + ", usuarDomicilio=" + usuarDomicilio + ", usuarPoblacion=" + usuarPoblacion + ", usuarProvincia="
                + usuarProvincia + ", usuarPais=" + usuarPais + ", usuarCodigoPostal=" + usuarCodigoPostal
                + ", usuarTelefono=" + usuarTelefono + ", usuarEmail=" + usuarEmail + ", usuarConsentimientoDatos="
                + usuarConsentimientoDatos + ", usuarCreado=" + usuarCreado + ", usuarModificado=" + usuarModificado 
                + ", ingresos=" + ingresos + ", medicos=" + medicos + "]";
    }
}