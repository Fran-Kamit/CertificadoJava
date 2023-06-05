
    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);

    create table ingresos (
       numero_ingreso bigint not null auto_increment,
        alergias varchar(255),
        coste double precision,
        diagnostico varchar(255),
        fecha_alta date,
        fecha_ingreso date,
        creado_dia datetime(6),
        modificado_dia datetime(6),
        numero_cama integer,
        numero_habitacion integer,
        numero_planta integer,
        observaciones varchar(255),
        medicos_codigo_identificacion varchar(255) not null,
        usuarios_codigo_identificacion BINARY(16),
        primary key (numero_ingreso)
    ) engine=InnoDB;

    create table medicos (
       codigo_identificacion varchar(255) not null,
        dni_usuario varchar(255),
        cargo varchar(255),
        creado_dia datetime(6),
        especialidad varchar(255),
        modificado_dia datetime(6),
        numero_colegiado varchar(255),
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    create table usuarios (
       codigo_identificacion BINARY(16) not null,
        apellidos varchar(255),
        codigo_postal integer,
        consentimiento_datos bit,
        creado_dia datetime(6),
        dni varchar(255),
        domicilio varchar(255),
        email varchar(255),
        fecha_nacimiento date,
        genero varchar(255),
        modificado_dia datetime(6),
        nombre varchar(255),
        numss varchar(255),
        pais varchar(255),
        poblacion varchar(255),
        provincia varchar(255),
        telefono integer,
        primary key (codigo_identificacion)
    ) engine=InnoDB;

    alter table ingresos 
       add constraint FK1ciugconym8p22um5lsrsrafl 
       foreign key (medicos_codigo_identificacion) 
       references medicos (codigo_identificacion);

    alter table ingresos 
       add constraint FK46udkc7iga01yy18klhc4aatp 
       foreign key (usuarios_codigo_identificacion) 
       references usuarios (codigo_identificacion);
