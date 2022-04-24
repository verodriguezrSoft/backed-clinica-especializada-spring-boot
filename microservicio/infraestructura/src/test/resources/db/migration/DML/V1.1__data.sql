-- insert into usuario(id, nombre,clave,fecha_creacion) values(1,'test','1234',now())
insert into usuario (nombre, email, numero_telefono, fecha_creacion) values ('test', 'prueba@gmail.com', '314544', now());
insert into medico (id, nombre, especialidad) values (1, '1234', 'optometra');
insert into cita (id, id_usuario, fecha_cita, fecha_actualizacion, id_especialidad, id_medico, precio_cita,valor_trm, tipo_moneda)
values (1, 1234, now(), now(), 1, 12345, 20000, 3475.2, 'US');
insert into festivo (dia, mes_numerico, anio) values ( 25, 4, 2022)