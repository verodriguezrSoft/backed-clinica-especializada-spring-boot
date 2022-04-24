package com.ceiba.citas.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.citas.comando.ComandoCita;
import com.ceiba.citas.comando.fabrica.FabricaCita;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.servicio.cita.ServicioCrearCita;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCita implements ManejadorComandoRespuesta<ComandoCita, ComandoRespuesta<Long>> {

    private final FabricaCita fabricaCita;
    private final ServicioCrearCita servicioCrearCita;

    public ManejadorCrearCita(FabricaCita fabricaCita, ServicioCrearCita servicioCrearCita) {
        this.fabricaCita = fabricaCita;
        this.servicioCrearCita = servicioCrearCita;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoCita comandoCita) {
        Cita cita = this.fabricaCita.crear(comandoCita);
        return new ComandoRespuesta<>(this.servicioCrearCita.ejecutar(cita));
    }

}
