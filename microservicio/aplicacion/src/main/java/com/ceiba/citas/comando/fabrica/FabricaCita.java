package com.ceiba.citas.comando.fabrica;

import com.ceiba.citas.comando.ComandoCita;
import com.ceiba.usuario.modelo.entidad.Cita;
import org.springframework.stereotype.Component;

@Component
public class FabricaCita {

    public Cita crear(ComandoCita comandoCita){
        return new Cita(
               comandoCita.getId(),
               comandoCita.getIdUsuario(),
                comandoCita.getFechaCita(),
                comandoCita.getFechaActualizacion(),
                comandoCita.getIdEspecialidad(),
                comandoCita.getIdMedico(),
                comandoCita.getPrecioCita(),
                comandoCita.getValorTRM(),
                comandoCita.getTipoMoneda()
        );
    }
}
