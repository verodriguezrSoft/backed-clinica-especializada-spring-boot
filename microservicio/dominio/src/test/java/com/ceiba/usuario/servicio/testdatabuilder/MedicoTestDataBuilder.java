package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.modelo.entidad.Usuario;

public class MedicoTestDataBuilder {
    private Long id;
    private String nombre;
    private String especialidad;

    public MedicoTestDataBuilder() {
        nombre = "carlos";
        especialidad = "ortopedista";
    }

    public MedicoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public MedicoTestDataBuilder conNombre(String nombreUsuario) {
        this.nombre = nombreUsuario;
        return this;
    }

    public Medico build() {
        return new Medico(id, nombre, especialidad);
    }

}
