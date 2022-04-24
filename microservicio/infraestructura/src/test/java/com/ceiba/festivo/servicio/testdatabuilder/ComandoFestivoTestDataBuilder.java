package com.ceiba.festivo.servicio.testdatabuilder;

import com.ceiba.festivo.comando.ComandoFestivo;
import com.ceiba.usuario.comando.ComandoUsuario;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComandoFestivoTestDataBuilder {

    private Long id;
    private int dia;
    private int mesNumerico;
    private int anio;

    public ComandoFestivoTestDataBuilder() {
        dia = 25;
        mesNumerico = 04;
        anio = 2022;
    }


    public ComandoFestivo build() {
        return new ComandoFestivo(id, dia, mesNumerico, anio);
    }
}
