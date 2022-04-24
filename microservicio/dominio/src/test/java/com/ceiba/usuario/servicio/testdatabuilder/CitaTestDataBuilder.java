package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.Cita;
import jdk.nashorn.internal.objects.annotations.Getter;

import lombok.AllArgsConstructor;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaTestDataBuilder {
    private Long id;
    private Long idUsuario;
    private LocalDateTime fechaCita;
    private LocalDateTime fechaActualizacion;
    private Long idEspecialidad;
    private Long idMedico;
    private BigDecimal precioCita;
    private BigDecimal valorTRM;
    private String tipoMoneda;

    public CitaTestDataBuilder() {
        idUsuario = 1234L;
        fechaCita = LocalDateTime.now();
        fechaActualizacion = LocalDateTime.now();
        idEspecialidad = 1L;
        idMedico = 12345L;
        precioCita = new BigDecimal("20000");
        valorTRM = new BigDecimal("3475.2");
        tipoMoneda = "US";
    }

    public CitaTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public CitaTestDataBuilder conFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
        return this;
    }

    public CitaTestDataBuilder conFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
        return this;
    }

    public Cita build(){
        return new Cita(id, idUsuario, fechaCita, fechaActualizacion, idEspecialidad, idMedico, precioCita, valorTRM, tipoMoneda);
    }
}
