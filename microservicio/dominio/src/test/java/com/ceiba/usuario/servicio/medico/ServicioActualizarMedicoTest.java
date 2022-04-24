package com.ceiba.usuario.servicio.medico;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.testdatabuilder.MedicoTestDataBuilder;
import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;
import com.ceiba.usuario.servicio.usuario.ServicioActualizarUsuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioActualizarMedicoTest {
//    @Test
//    @DisplayName("Deberia validar la existencia previa del medico")
//    void deberiaValidarLaExistenciaPreviaDelUsuario() {
//        // arrange
//        Medico usuario = new MedicoTestDataBuilder().conId(1L).build();
//        RepositorioMedico repositorioMedico = Mockito.mock(RepositorioMedico.class);
//        Mockito.when(repositorioMedico.existePorId(Mockito.anyLong())).thenReturn(false);
//        ServicioActualizarMedico servicioActualizarUsuario = new ServicioActualizarMedico(repositorioMedico);
//        // act - assert
//        BasePrueba.assertThrows(() -> servicioActualizarUsuario.ejecutar(usuario), ExcepcionDuplicidad.class,"El usuario ya existe en el sistema");
//    }

}