package com.ceiba.festivo.controlado;

import com.ceiba.ApplicationMock;
import com.ceiba.citas.comando.ComandoCita;
import com.ceiba.citas.controlador.ComandoControladorCitas;
import com.ceiba.citas.servicio.testdatabuilder.ComandoCitasTestDataBuilder;
import com.ceiba.festivo.comando.ComandoFestivo;
import com.ceiba.festivo.servicio.testdatabuilder.ComandoFestivoTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ComandoControladorFestivo.class)
@ContextConfiguration(classes= ApplicationMock.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class ComandoControladorFestivoTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Test
    @DisplayName("Deberia crear una festivo")
    void deberiaCrearUnFestivo() throws Exception{
        // arrange
        ComandoFestivo festivo = new ComandoFestivoTestDataBuilder().build();
        // act - assert
        mocMvc.perform(post("/festivos")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(festivo)))
                .andExpect(status().isOk())
                .andExpect(content().json("{'valor': 2}"));
    }

    @Test
    @DisplayName("Deberia actualizar un festivo")
    void deberiaActualizarUnFestivo() throws Exception{
        // arrange
        Long id = 1L;
        ComandoFestivo festivo = new ComandoFestivoTestDataBuilder().build();
        // act - assert
        mocMvc.perform(put("/festivos/{id}",id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(festivo)))
                .andExpect(status().isOk());
    }



    @Test
    @DisplayName("Deberia eliminar un festivo")
    void deberiaEliminarUnFestivo() throws Exception {
        // arrange
        Long id = 1L;
        // act - assert
        mocMvc.perform(delete("/festivos/{id}",id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        mocMvc.perform(get("/festivos")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(0)));
    }


}