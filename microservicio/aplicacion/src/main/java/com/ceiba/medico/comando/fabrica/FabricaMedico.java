package com.ceiba.medico.comando.fabrica;

import com.ceiba.medico.comando.ComandoMedico;
import com.ceiba.usuario.modelo.entidad.Medico;
import org.springframework.stereotype.Component;

@Component
public class FabricaMedico {

    public Medico crear(ComandoMedico comandoMedico) {
        return new Medico(
                comandoMedico.getId(),
                comandoMedico.getNombre(),
                comandoMedico.getEspecialidad()
        );
    }
}
