package com.ceiba.usuario.servicio.medico;

import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;

public class ServicioEliminarMedico {

    private final RepositorioMedico repositorioMedico;

    public ServicioEliminarMedico(RepositorioMedico repositorioMedico) {
        this.repositorioMedico = repositorioMedico;
    }

    public void ejecutar(Long id) {
        this.repositorioMedico.eliminar(id);
    }
}
