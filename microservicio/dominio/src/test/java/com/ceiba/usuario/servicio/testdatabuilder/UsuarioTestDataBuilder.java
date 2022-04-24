package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.Usuario;

import java.time.LocalDateTime;

public class UsuarioTestDataBuilder {

    private Long id;
    private String nombre;
    private String email;
    private String numeroTelefono;
    private LocalDateTime fechaCreacion;

    public UsuarioTestDataBuilder() {
        nombre = "carlos";
        email = "prueba@gmail.com";
        numeroTelefono = "3145454484";
        fechaCreacion = LocalDateTime.now();
    }

    public UsuarioTestDataBuilder conEmail(String email) {
        this.email = email;
        return this;
    }

    public UsuarioTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public UsuarioTestDataBuilder conFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
        return this;
    }

    public UsuarioTestDataBuilder conNombre(String nombreUsuario) {
        this.nombre = nombreUsuario;
        return this;
    }

    public UsuarioTestDataBuilder conNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        return this;
    }

    public Usuario build() {
        return new Usuario(id, nombre, email, numeroTelefono, fechaCreacion);
    }
}
