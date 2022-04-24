package com.ceiba.medico.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.medico.comando.ComandoMedico;
import com.ceiba.medico.comando.fabrica.FabricaMedico;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.servicio.medico.ServicioActualizarMedico;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarMedico implements ManejadorComando<ComandoMedico> {

    private final FabricaMedico fabricaMedico;
    private final ServicioActualizarMedico servicioActualizarMedico;


    public ManejadorActualizarMedico(FabricaMedico fabricaMedico, ServicioActualizarMedico servicioActualizarMedico) {
        this.fabricaMedico = fabricaMedico;
        this.servicioActualizarMedico = servicioActualizarMedico;
    }

    public void ejecutar(ComandoMedico comandoUsuario) {
        Medico medico = this.fabricaMedico.crear(comandoUsuario);
        this.servicioActualizarMedico.ejecutar(medico);
    }
}
