package com.ceiba.usuario.servicio.medico;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.testdatabuilder.MedicoTestDataBuilder;
import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;
import com.ceiba.usuario.servicio.usuario.ServicioCrearUsuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioCrearMedicoTest {
    @Test
    @DisplayName("Deberia lanzar una exepcion cuando se valide la existencia del Usuario")
    void deberiaLanzarUnaExepcionCuandoSeValideLaExistenciaDelUsuario() {
        // arrange
        Medico medico = new MedicoTestDataBuilder().build();
        RepositorioMedico repositorioMedico = Mockito.mock(RepositorioMedico.class);
        Mockito.when(repositorioMedico.existe(Mockito.anyString())).thenReturn(true);
        ServicioCrearMedico servicioCrearMedico = new ServicioCrearMedico(repositorioMedico);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearMedico.ejecutar(medico), ExcepcionDuplicidad.class,"El medico ya existe en el sistema");
    }
}