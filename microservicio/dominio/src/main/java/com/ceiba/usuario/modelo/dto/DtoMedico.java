package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoMedico {
    private Long id;
    private String nombre;
    private String especialidad;
}
