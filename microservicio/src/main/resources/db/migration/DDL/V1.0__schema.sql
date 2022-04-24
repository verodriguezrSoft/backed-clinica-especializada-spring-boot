create table usuario (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 email varchar(100) not null,
 numero_telefono varchar(100) not null,
 fecha_creacion datetime null,
 primary key (id)
);

create table medico(
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 especialidad varchar(100) not null,
 primary key (id)
);

create table cita(
 id int(11) not null auto_increment,
 id_usuario int(11) not null,
 fecha_cita datetime not null,
 fecha_actualizacion datetime null,
 id_especialidad int(11) not null,
 id_medico int(11) not null,
 precio_cita decimal(20, 2) not null,
 primary key (id)
);

create table festivo(
 id int(11) not null auto_increment,
 dia int(2) not null,
 mes_numerico int(2) not null,
 anio int(11) not null,
  primary key (id)
);


