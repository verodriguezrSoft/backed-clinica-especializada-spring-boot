package com.ceiba.medico.controlado;

import com.ceiba.ApplicationMock;
import com.ceiba.medico.comando.ComandoMedico;
import com.ceiba.medico.servicio.testdatabuilder.ComandoMedicoTestDataBuilder;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.controlador.ComandoControladorUsuario;
import com.ceiba.usuario.servicio.testdatabuilder.ComandoUsuarioTestDataBuilder;
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

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ComandoControladorMedico.class)
@ContextConfiguration(classes= ApplicationMock.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class ComandoControladorMedicoTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;


//    @Test
//    @DisplayName("Deberia crear un medico")
//    void deberiaCrearUnMedico() throws Exception{
//        // arrange
//        ComandoMedico medico = new ComandoMedicoTestDataBuilder().build();
//        // act - assert
//        mocMvc.perform(post("/medicos")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(medico)))
//                .andExpect(status().isOk())
//                .andExpect(content().json("{'valor': 2}"));
//    }


    @Test
    @DisplayName("Deberia actualizar un medico")
      void deberiaActualizarUnMedico() throws Exception{
        // arrange
        Long id = 1L;
        ComandoMedico medico = new ComandoMedicoTestDataBuilder().build();
        // act - assert
        mocMvc.perform(put("/medicos/{id}",id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(medico)))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("Deberia eliminar un medico")
    void deberiaEliminarUnMedico() throws Exception {
        // arrange
        Long id = 1L;
        // act - assert
        mocMvc.perform(delete("/medicos/{id}",id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        mocMvc.perform(get("/medicos")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(0)));
    }


}