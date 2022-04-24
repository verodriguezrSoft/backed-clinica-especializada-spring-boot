package com.ceiba.usuario.servicio.festivo;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RespositorioFestivo;
import com.ceiba.usuario.servicio.medico.ServicioCrearMedico;
import com.ceiba.usuario.servicio.testdatabuilder.FestivoTestBuilder;
import com.ceiba.usuario.servicio.testdatabuilder.MedicoTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioCrearFestivoTest {
    @Test
    @DisplayName("Deberia crear lanzar una expecion si el festivo ya existe")
    void deberiaLanzarUnaExepcionCuandoSeValideLaExistenciaDelUsuario() {
        // arrange
        Festivo festivo = new FestivoTestBuilder().build();
        RespositorioFestivo respositorioFestivo = Mockito.mock(RespositorioFestivo.class);
        Mockito.when(respositorioFestivo.exitePorFecha(Mockito.any())).thenReturn(true);
        ServicioCrearFestivo servicioCrearFestivo = new ServicioCrearFestivo(respositorioFestivo);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearFestivo.ejecutar(festivo), ExcepcionDuplicidad.class,"El festivo ya existe");
    }
}