package com.ceiba.medico.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoMedico {
    private Long id;
    private String nombre;
    private String especialidad;
}
