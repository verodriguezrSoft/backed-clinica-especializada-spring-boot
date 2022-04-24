package com.ceiba.medico.controlado;

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
@RequestMapping("/medicos")
public class ComandoControladorMedico {

    private final ManejadorCreaMedico manejadorCreaMedico;
    private final ManejadorEliminarMedico manejadorEliminarMedico;
    private final ManejadorActualizarMedico manejadorActualizarMedico;

    @Autowired
    public ComandoControladorMedico(ManejadorCreaMedico manejadorCreaMedico, ManejadorEliminarMedico manejadorEliminarMedico, ManejadorActualizarMedico manejadorActualizarMedico) {
        this.manejadorCreaMedico = manejadorCreaMedico;
        this.manejadorEliminarMedico = manejadorEliminarMedico;
        this.manejadorActualizarMedico = manejadorActualizarMedico;
    }

    @PostMapping
    @ApiOperation("Crea medico")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoMedico comandoMedico){
        return  manejadorCreaMedico.ejecutar(comandoMedico);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable Long id){
        manejadorEliminarMedico.ejecutar(id);
    }

    @PutMapping(value = "/{id}")
    @ApiOperation("Actualizar medico")
    public void actualizar(@RequestBody ComandoMedico comandoMedico, @PathVariable Long id){
        comandoMedico.setId(id);
        manejadorActualizarMedico.ejecutar(comandoMedico);
    }


}
