package com.ceiba.festivo.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.festivo.comando.ComandoFestivo;
import com.ceiba.festivo.comando.fabrica.FabricaFestivo;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.servicio.cita.ServicioCrearCita;
import com.ceiba.usuario.servicio.festivo.ServicioCrearFestivo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearFestivo implements ManejadorComandoRespuesta<ComandoFestivo, ComandoRespuesta<Long>> {

    private final FabricaFestivo fabricaFestivo;
    private final ServicioCrearFestivo servicioCrearFestivo;

    public ManejadorCrearFestivo(FabricaFestivo fabricaFestivo, ServicioCrearFestivo servicioCrearFestivo) {
        this.fabricaFestivo = fabricaFestivo;
        this.servicioCrearFestivo = servicioCrearFestivo;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoFestivo comandoCita) {
        Festivo festivo = this.fabricaFestivo.crear(comandoCita);
        return new ComandoRespuesta<>(this.servicioCrearFestivo.ejecutar(festivo));
    }

}
