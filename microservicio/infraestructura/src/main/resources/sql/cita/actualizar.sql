update cita
set id = :id,
	fecha_cita = :fechaCita,
	fecha_actualizacion = :fechaActualizacion,
	id_especialidad = :idEspecialidad,
	id_medico = :idMedico,
	precio_cita = :precioCita,
	valor_trm = :valorTRM,
	tipo_moneda =:tipoMoneda
where id = :id