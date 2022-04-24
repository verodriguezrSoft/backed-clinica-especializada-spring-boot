package com.ceiba.medico.servicio.testdatabuilder;

import com.ceiba.medico.comando.ComandoMedico;
import com.ceiba.usuario.comando.ComandoUsuario;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComandoMedicoTestDataBuilder {

    private Long id;
    private String nombre;
    private String especialidad;

    public ComandoMedicoTestDataBuilder() {
        nombre = "1234";
        especialidad = "optometra";
    }

    public ComandoMedicoTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ComandoMedico build() {
        return new ComandoMedico(id,nombre, especialidad);
    }
}
