package com.ceiba.usuario.entidad;

import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.servicio.testdatabuilder.MedicoTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoTest {

    @Test
    @DisplayName("Deberia crear correctamente un medico")
    void deberiaCrearCorrectamenteUnMedico() {
        Medico medico = new MedicoTestDataBuilder().build();
        assertEquals("carlos", medico.getNombre());
        assertEquals("ortopedista", medico.getEspecialidad());
    }

}
