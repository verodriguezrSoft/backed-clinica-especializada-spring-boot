package com.ceiba.citas.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.citas.comando.ComandoCita;
import com.ceiba.citas.comando.manejador.ManejadorActualizarCita;
import com.ceiba.citas.comando.manejador.ManejadorCrearCita;
import com.ceiba.citas.comando.manejador.ManejadorEliminarCita;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/citas")
public class ComandoControladorCitas {
    private final ManejadorCrearCita manejadorCrearCita;
    private final ManejadorEliminarCita manejadorEliminarCita;
    private final ManejadorActualizarCita manejadorActualizarCita;

    @Autowired
    public ComandoControladorCitas(ManejadorCrearCita manejadorCrearCita, ManejadorEliminarCita manejadorEliminarCita, ManejadorActualizarCita manejadorActualizarCita) {
        this.manejadorCrearCita = manejadorCrearCita;
        this.manejadorEliminarCita = manejadorEliminarCita;
        this.manejadorActualizarCita = manejadorActualizarCita;
    }

    @PostMapping
    @ApiOperation("Crea citas")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoCita comandoCita){
//        comandoCita.setFechaCita(LocalDateTime.now());
        comandoCita.setFechaActualizacion(LocalDateTime.now());
        return  manejadorCrearCita.ejecutar(comandoCita);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable Long id){
        manejadorEliminarCita.ejecutar(id);
    }

    @PutMapping(value = "/{id}")
    @ApiOperation("Actualizar usuario")
    public void actualizar(@RequestBody ComandoCita comandoCita, @PathVariable Long id){
        comandoCita.setId(id);
        comandoCita.setFechaActualizacion(LocalDateTime.now());
        manejadorActualizarCita.ejecutar(comandoCita);
    }
}
