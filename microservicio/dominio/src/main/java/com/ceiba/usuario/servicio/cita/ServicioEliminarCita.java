package com.ceiba.usuario.servicio.cita;

import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.puerto.repositorio.RepositorioCita;

public class ServicioEliminarCita {

    private final RepositorioCita repositorioCita;

    public ServicioEliminarCita(RepositorioCita repositorioCita) {
        this.repositorioCita = repositorioCita;
    }

    public void ejecutar(Long id) {
        this.repositorioCita.eliminar(id);
    }
}
