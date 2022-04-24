package com.ceiba.medico.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.usuario.servicio.medico.ServicioEliminarMedico;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarMedico implements ManejadorComando<Long> {

    private final ServicioEliminarMedico servicioEliminarMedico;

    public ManejadorEliminarMedico(ServicioEliminarMedico servicioEliminarMedico) {
        this.servicioEliminarMedico = servicioEliminarMedico;
    }

    public void ejecutar(Long idUsuario) {
        this.servicioEliminarMedico.ejecutar(idUsuario);
    }
}
