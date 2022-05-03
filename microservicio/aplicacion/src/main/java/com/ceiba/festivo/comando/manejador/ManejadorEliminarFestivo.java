package com.ceiba.festivo.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.usuario.servicio.cita.ServicioEliminarCita;
import com.ceiba.usuario.servicio.festivo.ServicioEliminarFestivo;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarFestivo implements ManejadorComando<Long> {

    private final ServicioEliminarFestivo servicioEliminarFestivo;

    public ManejadorEliminarFestivo(ServicioEliminarFestivo servicioEliminarFestivo) {
        this.servicioEliminarFestivo = servicioEliminarFestivo;
    }

    public void ejecutar(Long idFestivo) {
        this.servicioEliminarFestivo.ejecutar(idFestivo);
    }
}
