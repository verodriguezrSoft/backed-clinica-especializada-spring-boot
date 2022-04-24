package com.ceiba.usuario.entidad;

import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.servicio.testdatabuilder.CitaTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CitaTest {
//    @Test
//    @DisplayName("Deberia crear correctamente la cita")
//    void deberiaCrearCorrectamenteElUsusuario() {
//
//        LocalDateTime ahora = LocalDateTime.now();
//
//        Cita cita = new CitaTestDataBuilder().conId(1L).conFechaCita(ahora).conFechaActualizacion(ahora).build();
//
//        assertEquals(1, cita.getId());
//        assertEquals(1234L, cita.getIdUsuario());
//        assertEquals(ahora, cita.getFechaCita());
//        assertEquals(ahora, cita.getFechaActualizacion());
//        assertEquals(123456L, cita.getIdEspecialidad());
//        assertEquals(12345L, cita.getIdMedico());
//        assertEquals(new BigDecimal("20000"), cita.getPrecioCita());
//    }
}
