package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.Festivo;

public class FestivoTestBuilder {
    private Long id;
    private int dia;
    private int mesNumerico;
    private int anio;

    public FestivoTestBuilder() {
        dia = 24;
        mesNumerico = 4;
        anio = 2022;
    }

    public FestivoTestBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public Festivo build(){
        return new Festivo(id, dia, mesNumerico, anio);
    }
}
