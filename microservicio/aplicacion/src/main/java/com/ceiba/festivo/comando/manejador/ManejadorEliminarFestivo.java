package com.ceiba.festivo.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.usuario.servicio.cita.ServicioEliminarCita;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarFestivo implements ManejadorComando<Long> {

    private final ServicioEliminarCita servicioEliminarCita;

    public ManejadorEliminarFestivo(ServicioEliminarCita servicioEliminarCita) {
        this.servicioEliminarCita = servicioEliminarCita;
    }

    public void ejecutar(Long idUsuario) {
        this.servicioEliminarCita.ejecutar(idUsuario);
    }
}
