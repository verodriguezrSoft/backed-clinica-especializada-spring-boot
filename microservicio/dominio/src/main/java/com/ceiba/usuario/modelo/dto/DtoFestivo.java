package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoFestivo {
    private Long id;
    private int dia;
    private int mesNumerico;
    private int anio;
}
