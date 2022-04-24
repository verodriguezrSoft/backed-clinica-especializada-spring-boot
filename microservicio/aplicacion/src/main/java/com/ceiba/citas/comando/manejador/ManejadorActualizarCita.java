package com.ceiba.citas.comando.manejador;

import com.ceiba.citas.comando.ComandoCita;
import com.ceiba.citas.comando.fabrica.FabricaCita;
import com.ceiba.manejador.ManejadorComando;
import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.servicio.cita.ServicioActualizarCita;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarCita implements ManejadorComando<ComandoCita> {

    private final FabricaCita fabricaCita;
    private final ServicioActualizarCita servicioActualizarCita;

    public ManejadorActualizarCita(FabricaCita fabricaCita, ServicioActualizarCita servicioActualizarCita) {
        this.fabricaCita = fabricaCita;
        this.servicioActualizarCita = servicioActualizarCita;
    }

    public void ejecutar(ComandoCita comandoCita) {
        Cita cita = this.fabricaCita.crear(comandoCita);
        this.servicioActualizarCita.ejecutar(cita);
    }
}
