package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
@Setter
public class Cita {

    private static final String SE_DEBE_INGRESAR_ID = "Se debe ingresar el id";
    private static final String SE_DEBE_INGRESAR_ID_USUARIO = "Se debe ingresar el id del usuario";
    private static final String SE_DEBE_INGRESAR_LA_FECHA_CREACION = "Se debe ingresar la fecha de creación";
    private static final String SE_DEBE_INGRESAR_EL_MEDICO = "Se debe ingresar el medico";

    private static final String SE_DEBE_INGRESAR_LA_ESPECIALIDAD = "Se debe ingresar la especialidad";

    private Long id;
    private Long idUsuario;
    private LocalDateTime fechaCita;
    private LocalDateTime fechaActualizacion;
    private Long idEspecialidad;
    private Long idMedico;

    private BigDecimal precioCita;

    public Cita(Long id, Long idUsuario, LocalDateTime fechaCita, LocalDateTime fechaActualizacion, Long idEspecialidad, Long idMedico, BigDecimal precioCita) {
        validarObligatorio(idUsuario, SE_DEBE_INGRESAR_ID_USUARIO);
        validarObligatorio(fechaCita, SE_DEBE_INGRESAR_LA_FECHA_CREACION);
        validarObligatorio(idMedico, SE_DEBE_INGRESAR_EL_MEDICO);
        validarObligatorio(idEspecialidad, SE_DEBE_INGRESAR_LA_ESPECIALIDAD);

        this.id = id;
        this.idUsuario = idUsuario;
        this.fechaCita = fechaCita;
        this.fechaActualizacion = fechaActualizacion;
        this.idEspecialidad = idEspecialidad;
        this.idMedico = idMedico;
        this.precioCita = precioCita;
    }
}
