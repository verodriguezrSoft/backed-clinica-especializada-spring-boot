package com.ceiba.citas.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.usuario.servicio.cita.ServicioEliminarCita;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarCita implements ManejadorComando<Long> {

    private final ServicioEliminarCita servicioEliminarCita;

    public ManejadorEliminarCita(ServicioEliminarCita servicioEliminarCita) {
        this.servicioEliminarCita = servicioEliminarCita;
    }

    public void ejecutar(Long idUsuario) {
        this.servicioEliminarCita.ejecutar(idUsuario);
    }
}
