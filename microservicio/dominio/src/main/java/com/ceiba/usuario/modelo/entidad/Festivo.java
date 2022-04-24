package com.ceiba.usuario.modelo.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

public class Festivo {

    private Long id;
    private int dia;
    private int mesNumerico;
    private int anio;

    public Festivo(Long id, int dia, int mesNumerico, int anio) {
        this.id = id;
        this.dia = dia;
        this.mesNumerico = mesNumerico;
        this.anio = anio;
    }
}
