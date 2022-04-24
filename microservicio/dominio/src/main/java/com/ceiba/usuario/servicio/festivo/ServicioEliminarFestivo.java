package com.ceiba.usuario.servicio.festivo;

import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RespositorioFestivo;

public class ServicioEliminarFestivo {

    private final RespositorioFestivo repRespositorioFestivo;

    public ServicioEliminarFestivo(RespositorioFestivo repRespositorioFestivo) {
        this.repRespositorioFestivo = repRespositorioFestivo;
    }

    public void ejecutar(Long id) {
        this.repRespositorioFestivo.eliminar(id);
    }
}
