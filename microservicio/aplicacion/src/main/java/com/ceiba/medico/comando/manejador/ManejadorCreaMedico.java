package com.ceiba.medico.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.medico.comando.ComandoMedico;
import com.ceiba.medico.comando.fabrica.FabricaMedico;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.servicio.medico.ServicioCrearMedico;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCreaMedico implements ManejadorComandoRespuesta<ComandoMedico, ComandoRespuesta<Long>> {

    private final FabricaMedico fabricaMedico;
    private final ServicioCrearMedico servicioCrearMedico;

    public ManejadorCreaMedico(FabricaMedico fabricaMedico, ServicioCrearMedico servicioCrearMedico) {
        this.fabricaMedico = fabricaMedico;
        this.servicioCrearMedico = servicioCrearMedico;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoMedico comandoMedico) {
        Medico medico = this.fabricaMedico.crear(comandoMedico);
        return new ComandoRespuesta<>(this.servicioCrearMedico.ejecutar(medico));
    }
}
