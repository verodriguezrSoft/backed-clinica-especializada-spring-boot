package com.ceiba.festivo.controlado;

import com.ceiba.ComandoRespuesta;
import com.ceiba.festivo.comando.ComandoFestivo;
import com.ceiba.festivo.comando.manejador.ManejadorActualizarFestivo;
import com.ceiba.festivo.comando.manejador.ManejadorCrearFestivo;
import com.ceiba.festivo.comando.manejador.ManejadorEliminarFestivo;
import com.ceiba.medico.comando.ComandoMedico;
import com.ceiba.medico.comando.manejador.ManejadorActualizarMedico;
import com.ceiba.medico.comando.manejador.ManejadorCreaMedico;
import com.ceiba.medico.comando.manejador.ManejadorEliminarMedico;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/festivos")
public class ComandoControladorFestivo {

    private final ManejadorCrearFestivo manejadorCrearFestivo;
    private final ManejadorEliminarFestivo manejadorEliminarFestivo;
    private final ManejadorActualizarFestivo manejadorActualizarFestivo;

    @Autowired
    public ComandoControladorFestivo(ManejadorCrearFestivo manejadorCrearFestivo, ManejadorEliminarFestivo manejadorEliminarFestivo, ManejadorActualizarFestivo manejadorActualizarFestivo) {
        this.manejadorCrearFestivo = manejadorCrearFestivo;
        this.manejadorEliminarFestivo = manejadorEliminarFestivo;
        this.manejadorActualizarFestivo = manejadorActualizarFestivo;
    }

    @PostMapping
    @ApiOperation("Crea festivo")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoFestivo comandoFestivo){
        return  manejadorCrearFestivo.ejecutar(comandoFestivo);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable Long id){
        manejadorEliminarFestivo.ejecutar(id);
    }

    @PutMapping(value = "/{id}")
    @ApiOperation("Actualizar festivo")
    public void actualizar(@RequestBody ComandoFestivo comandoFestivo, @PathVariable Long id){
        comandoFestivo.setId(id);
        manejadorActualizarFestivo.ejecutar(comandoFestivo);
    }


}
