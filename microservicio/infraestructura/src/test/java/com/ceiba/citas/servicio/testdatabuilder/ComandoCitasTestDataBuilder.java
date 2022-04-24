package com.ceiba.citas.servicio.testdatabuilder;

import com.ceiba.citas.comando.ComandoCita;
import com.ceiba.usuario.comando.ComandoUsuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class ComandoCitasTestDataBuilder {

    private Long id;
    private Long idUsuario;
    private LocalDateTime fechaCita;
    private LocalDateTime fechaActualizacion;
    private Long idEspecialidad;
    private Long idMedico;
    private BigDecimal precioCita;
    private BigDecimal valorTRM;
    private String tipoMoneda;

    public ComandoCitasTestDataBuilder() {
        idUsuario = 1234L;
        fechaCita = LocalDateTime.now();
        fechaActualizacion = LocalDateTime.now();
        idEspecialidad = 1L;
        idMedico = 12345L;
        precioCita = new BigDecimal("20000");
        valorTRM = new BigDecimal("3475.2");
        tipoMoneda = "US";
    }

//    public ComandoCitasTestDataBuilder conNombre(String nombre) {
//        this.nombre = nombre;
//        return this;
//    }

    public ComandoCita build() {
        return new ComandoCita(id, idUsuario, fechaCita, fechaActualizacion, idEspecialidad, idMedico, precioCita, valorTRM, tipoMoneda);
    }
}
