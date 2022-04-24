package com.ceiba.usuario.servicio.festivo;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.puerto.repositorio.RespositorioFestivo;
import com.ceiba.usuario.servicio.testdatabuilder.FestivoTestBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioActualizarFestivoTest {
    @Test
    @DisplayName("Deberia validar la existencia previa del festivo")
    void deberiaValidarLaExistenciaPrevioDelFestivo() {
        // arrange
        Festivo festivo = new FestivoTestBuilder().build();
        RespositorioFestivo respositorioFestivo = Mockito.mock(RespositorioFestivo.class);
        Mockito.when(respositorioFestivo.exitePorId(Mockito.anyLong())).thenReturn(false);
        ServicioActualizarFestivo servicioActualizarFestivo = new ServicioActualizarFestivo(respositorioFestivo);
        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarFestivo.ejecutar(festivo), ExcepcionDuplicidad.class,"El festivo no existe en el sistema");
    }

    @Test
    @DisplayName("Deberia actualizar correctamente en el repositorio")
    void deberiaActualizarCorrectamenteEnElRepositorio() {
        // arrange
        Festivo festivo = new FestivoTestBuilder().conId(1L).build();
        RespositorioFestivo respositorioFestivo = Mockito.mock(RespositorioFestivo.class);
        Mockito.when(respositorioFestivo.exitePorId(Mockito.anyLong())).thenReturn(true);
        ServicioActualizarFestivo servicioActualizarFestivo = new ServicioActualizarFestivo(respositorioFestivo);
        // act
        servicioActualizarFestivo.ejecutar(festivo);
        //assert
        Mockito.verify(respositorioFestivo,Mockito.times(1)).actualizar(festivo);

    }
}