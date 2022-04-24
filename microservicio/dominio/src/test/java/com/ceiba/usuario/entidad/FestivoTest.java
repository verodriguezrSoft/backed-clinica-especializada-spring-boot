package com.ceiba.usuario.entidad;

import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.servicio.testdatabuilder.FestivoTestBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FestivoTest {

    @Test
    @DisplayName("Deberia crear correctamente un festivo")
    void deberiaCrearCorrectamenteUnFestivo() {

        Festivo festivo = new FestivoTestBuilder().build();
        assertEquals(24, festivo.getDia());
        assertEquals(4, festivo.getMesNumerico());
        assertEquals(2022, festivo.getAnio());
    }
}
