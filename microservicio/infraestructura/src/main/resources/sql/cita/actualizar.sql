update cita
set id = :id,
	fecha_cita = :fechaCita,
	fecha_actualizacion = :fechaActualizacion,
	id_especialidad = :idEspecialidad,
	id_medico = :idMedico,
	precio_cita = :precioCita
where id = :id