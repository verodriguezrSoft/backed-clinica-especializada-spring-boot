package com.ceiba.usuario.enums;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public enum Especialidades {
    CARDIALOGIA_CLINICA(1L, "CARDIOLOGIA CLINICA", new BigDecimal(100)),
    CIRUGIA_GENERAL(2L, "CIRUGIA GENERAL", new BigDecimal(1500)),
    PRUEBA_COVID(3L, "PRUEBA COVID", new BigDecimal(150)),
    DERMATOLOGIA(4L, "DERMATOLOGIA", new BigDecimal(160)),
    OPTOMETRIA(5L, "OPTOMETRÍA", new BigDecimal(180));

    private final Long idEspecialidad;
    private final String nommbreEspecialdiad;
    private final BigDecimal valorEspecialidad;

    Especialidades(Long idEspecialidad, String nommbreEspecialdiad, BigDecimal valorEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.nommbreEspecialdiad = nommbreEspecialdiad;
        this.valorEspecialidad = valorEspecialidad;
    }

    public static Especialidades getById(Long id){
        for (Especialidades especialidad: values()){
            if (especialidad.idEspecialidad.equals(id)){
                return especialidad;
            }
        }
        throw new IllegalArgumentException("No hay especialidad para el id: " + id);
    }

}
