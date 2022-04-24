package com.ceiba.usuario.servicio.medico;

import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.usuario.ServicioEliminarUsuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioEliminarMedicoTest {
    @Test
    @DisplayName("Deberia eliminar la cita llamando al repositorio")
    void deberiaEliminarElUsuarioLlamandoAlRepositorio() {
        RepositorioMedico repositorioMedico = Mockito.mock(RepositorioMedico.class);
        ServicioEliminarMedico servicioEliminarMedico = new ServicioEliminarMedico(repositorioMedico);

        servicioEliminarMedico.ejecutar(1l);

        Mockito.verify(repositorioMedico, Mockito.times(1)).eliminar(1l);

    }
}