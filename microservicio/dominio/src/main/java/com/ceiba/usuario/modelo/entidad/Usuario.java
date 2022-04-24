package com.ceiba.usuario.modelo.entidad;


import lombok.Getter;

import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Usuario {

    private static final String SE_DEBE_INGRESAR_LA_FECHA_CREACION = "Se debe ingresar la fecha de creación";
    private static final String LA_CLAVE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A = "La clave debe tener una longitud mayor o igual a %s";
    private static final String SE_DEBE_INGRESAR_LA_CLAVE = "Se debe ingresar la clave";
    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO = "Se debe ingresar el nombre de usuario";
    private static final String SE_DEBE_INGRESAR_EL_CORREO_DEL_USUARIO = "Se debe ingresar el correo del usuario";
    private static final String SE_DEBE_INGRESAR_EL_TELEFONO_DEL_USUARIO = "Se debe ingresar el teléfono del usuario";


    private static final int LONGITUD_MINIMA_CLAVE = 4;

    private Long id;
    private String nombre;
    private String email;
    private String numeroTelefono;
    private LocalDateTime fechaCreacion;

    public Usuario(Long id,String nombre,String email, String numeroTelefono, LocalDateTime fechaCreacion) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO);
        validarObligatorio(email, SE_DEBE_INGRESAR_EL_CORREO_DEL_USUARIO);
        validarObligatorio(numeroTelefono, SE_DEBE_INGRESAR_EL_TELEFONO_DEL_USUARIO);
        validarObligatorio(fechaCreacion, SE_DEBE_INGRESAR_LA_FECHA_CREACION);

        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.fechaCreacion = fechaCreacion;
    }

}
