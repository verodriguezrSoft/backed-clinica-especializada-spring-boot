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
import com.ceiba.usuario.servicio.usuario.ServicioActualizarUsuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioActualizarCitaTest {

    @Test
    @DisplayName("Deberia validar la existencia previa del cita")
    void deberiaValidarLaExistenciaPreviaDelaCita() {
        // arrange
        Cita cita = new CitaTestDataBuilder().conId(1L).build();
        RepositorioCita repositorioCita = Mockito.mock(RepositorioCita.class);
        Mockito.when(repositorioCita.existePorId(Mockito.anyLong())).thenReturn(false);
        DaoFestivo daoFestivo = Mockito.mock(DaoFestivo.class);
        ServicioActualizarCita servicioActualizarUsuario = new ServicioActualizarCita(repositorioCita, daoFestivo);
        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarUsuario.ejecutar(cita), ExcepcionDuplicidad.class,"La cita no existe en el sistema");
    }

    @Test
    @DisplayName("Deberia actualizar una cita de manera correcta")
    void deberiaCrearUnaActualizarCitaCorrectamente(){
        Cita cita = new CitaTestDataBuilder().conId(1L).build();
        RepositorioCita repositorioCita = Mockito.mock(RepositorioCita.class);
        Mockito.when(repositorioCita.existePorId(Mockito.anyLong())).thenReturn(true);
        DaoFestivo daoFestivo = Mockito.mock(DaoFestivo.class);
        ServicioActualizarCita servicioActualizarCita = new ServicioActualizarCita(repositorioCita, daoFestivo);
        // act
        servicioActualizarCita.ejecutar(cita);
        //aserr
        Mockito.verify(repositorioCita, Mockito.times(1)).actualizar(cita);
    }


}