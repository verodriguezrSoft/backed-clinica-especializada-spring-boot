package com.ceiba.usuario.servicio.cita;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.dao.DaoFestivo;
import com.ceiba.usuario.puerto.repositorio.RepositorioCita;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.testdatabuilder.CitaTestDataBuilder;
import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;
import com.ceiba.usuario.servicio.usuario.ServicioCrearUsuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioCrearCitaTest {
//    @Test
//    @DisplayName("Deberia lanzar una exepcion cuando se valide la existencia de la Cita")
//    void deberiaLanzarUnaExepcionCuandoSeValideLaExistenciaDelUsuario() {
//        // arrange
//        Cita cita = new CitaTestDataBuilder().build();
//        RepositorioCita repositorioUsuario = Mockito.mock(RepositorioCita.class);
//        Mockito.when(repositorioUsuario.existe(Mockito.anyString())).thenReturn(true);
//        DaoFestivo daoFestivo = Mockito.mock(DaoFestivo.class);
//        ServicioCrearCita servicioCrearCita = new ServicioCrearCita(repositorioUsuario, daoFestivo);
//        // act - assert
//        BasePrueba.assertThrows(() -> servicioCrearCita.ejecutar(cita), ExcepcionDuplicidad.class,"La cita ya existe");
//    }

}