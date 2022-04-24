package com.ceiba.usuario.modelo.entidad;


import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;


@Getter
public class Medico {


    private static final String ID_OBLIGATORIO = "Se debe ingresar la id";
    private static final String NOMBRE_OBLIGATORIO = "Se debe ingresar la nombre";
    private static final String ESPECIALIDAD_OBLIGATORIO = "Se debe ingresar la especialidad";


    private Long id;
    private String nombre;
    private String especialidad;

    public Medico(Long id, String nombre, String especialidad) {
        validarObligatorio(nombre, NOMBRE_OBLIGATORIO);
        validarObligatorio(especialidad, ESPECIALIDAD_OBLIGATORIO);

        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
}
