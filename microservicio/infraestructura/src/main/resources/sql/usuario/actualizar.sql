update usuario
set nombre = :nombre,
	email = :email,
	numero_telefono = :numeroTelefono,
	fecha_creacion = :fechaCreacion
where id = :id