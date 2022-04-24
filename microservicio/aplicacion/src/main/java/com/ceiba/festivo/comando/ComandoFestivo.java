package com.ceiba.festivo.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoFestivo {
    private Long id;
    private int dia;
    private int mesNumerico;
    private int anio;
}
