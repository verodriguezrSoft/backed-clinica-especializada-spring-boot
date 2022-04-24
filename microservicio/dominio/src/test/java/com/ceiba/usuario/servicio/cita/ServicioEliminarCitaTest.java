package com.ceiba.usuario.servicio.cita;

import com.ceiba.usuario.puerto.repositorio.RepositorioCita;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.usuario.ServicioEliminarUsuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioEliminarCitaTest {
    @Test
    @DisplayName("Deberia eliminar la cita llamando al repositorio")
    void deberiaEliminarElUsuarioLlamandoAlRepositorio() {
        RepositorioCita repositorioCita = Mockito.mock(RepositorioCita.class);
        ServicioEliminarCita servicioEliminarCita = new ServicioEliminarCita(repositorioCita);

        servicioEliminarCita.ejecutar(1l);

        Mockito.verify(repositorioCita, Mockito.times(1)).eliminar(1l);

    }
}