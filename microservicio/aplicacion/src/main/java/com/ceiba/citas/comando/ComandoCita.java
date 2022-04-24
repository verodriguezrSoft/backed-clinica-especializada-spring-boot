package com.ceiba.citas.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoCita {
    private Long id;
    private Long idUsuario;
    private LocalDateTime fechaCita;
    private LocalDateTime fechaActualizacion;
    private Long idEspecialidad;
    private Long idMedico;
    private BigDecimal precioCita;
    private BigDecimal valorTRM;
    private String tipoMoneda;
}
