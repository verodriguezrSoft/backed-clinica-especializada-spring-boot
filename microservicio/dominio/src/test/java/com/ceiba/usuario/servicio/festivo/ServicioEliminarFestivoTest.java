package com.ceiba.usuario.servicio.festivo;

import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.puerto.repositorio.RepositorioCita;
import com.ceiba.usuario.puerto.repositorio.RespositorioFestivo;
import com.ceiba.usuario.servicio.testdatabuilder.FestivoTestBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioEliminarFestivoTest {
    @Test
    @DisplayName("Deberia eliminar el usuario llamando al repositorio")
    void deberiaEliminarElFestivoLlamandoAlRepositorio() {
        RespositorioFestivo respositorioFestivo = Mockito.mock(RespositorioFestivo.class);
        ServicioEliminarFestivo servicioEliminarFestivo = new ServicioEliminarFestivo(respositorioFestivo);
        Festivo festivo = new FestivoTestBuilder().build();

        servicioEliminarFestivo.ejecutar(festivo);

        Mockito.verify(respositorioFestivo, Mockito.times(1)).eliminar(festivo);
    }

}