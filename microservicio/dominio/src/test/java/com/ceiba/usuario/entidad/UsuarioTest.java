package com.ceiba.usuario.entidad;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

//    @Test
//    @DisplayName("Deberia crear correctamente el usuario")
//    void deberiaCrearCorrectamenteElUsusuario() {
//        // arrange
//        LocalDateTime fechaCreacion = LocalDateTime.now();
//        //act
//        Usuario usuario = new UsuarioTestDataBuilder().conFechaCreacion(fechaCreacion).conId(1L).build();
//        //assert
//        assertEquals(1, usuario.getId());
//        assertEquals("carlos", usuario.getNombre());
//        assertEquals("prueba@gmail.com", usuario.getEmail());
//        assertEquals("3145454484", usuario.getNumeroTelefono());
//        assertEquals(fechaCreacion, usuario.getFechaCreacion());
//    }
//
//    @Test
//    void deberiaFallarSinNombreDeUsuario() {
//
//        //Arrange
//        UsuarioTestDataBuilder usuarioTestDataBuilder = new UsuarioTestDataBuilder().conNombre(null).conId(1L);
//        //act-assert
//        BasePrueba.assertThrows(() -> {
//                    usuarioTestDataBuilder.build();
//                },
//                ExcepcionValorObligatorio.class, "Se debe ingresar el nombre de usuario");
//    }
//
//    @Test
//    void deberiaFallaSinEmail(){
//        //Arrange
//        UsuarioTestDataBuilder usuarioTestDataBuilder = new UsuarioTestDataBuilder().conEmail(null).conId(1L);
//        //act-assert
//        BasePrueba.assertThrows(() -> {
//                    usuarioTestDataBuilder.build();
//                },
//                ExcepcionValorObligatorio.class, "Se debe ingresar el correo del usuario");
//    }
//
//    @Test
//    void deberiaFallaSinNumeroTelefono(){
//        //Arrange
//        UsuarioTestDataBuilder usuarioTestDataBuilder = new UsuarioTestDataBuilder().conNumeroTelefono(null).conId(1L);
//        //act-assert
//        BasePrueba.assertThrows(() -> {
//                    usuarioTestDataBuilder.build();
//                },
//                ExcepcionValorObligatorio.class, "Se debe ingresar el teléfono del usuario");
//    }
//
//
//
//    @Test
//    void deberiaFallarSinFechaCreacion() {
//
//        //Arrange
//        UsuarioTestDataBuilder usuarioTestDataBuilder = new UsuarioTestDataBuilder().conFechaCreacion(null).conId(1L);
//        //act-assert
//        BasePrueba.assertThrows(() -> {
//                    usuarioTestDataBuilder.build();
//                },
//                ExcepcionValorObligatorio.class, "Se debe ingresar la fecha de creación");
//    }


}
