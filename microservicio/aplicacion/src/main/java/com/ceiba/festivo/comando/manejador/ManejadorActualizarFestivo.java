package com.ceiba.festivo.comando.manejador;

import com.ceiba.festivo.comando.ComandoFestivo;
import com.ceiba.festivo.comando.fabrica.FabricaFestivo;
import com.ceiba.manejador.ManejadorComando;
import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.servicio.festivo.ServicioActualizarFestivo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarFestivo implements ManejadorComando<ComandoFestivo> {

    private final FabricaFestivo fabricaCita;
    private final ServicioActualizarFestivo servicioActualizarFestivo;

    public ManejadorActualizarFestivo(FabricaFestivo fabricaCita, ServicioActualizarFestivo servicioActualizarFestivo) {
        this.fabricaCita = fabricaCita;
        this.servicioActualizarFestivo = servicioActualizarFestivo;
    }

    public void ejecutar(ComandoFestivo comandoCita) {
        Festivo festivo = this.fabricaCita.crear(comandoCita);
        this.servicioActualizarFestivo.ejecutar(festivo);
    }
}
