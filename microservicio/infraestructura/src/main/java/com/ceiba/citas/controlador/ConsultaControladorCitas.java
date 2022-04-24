package com.ceiba.citas.controlador;

import com.ceiba.citas.consulta.ManejadorListarCitas;
import com.ceiba.medico.consulta.ManejadorListarMedicos;
import com.ceiba.usuario.modelo.dto.DtoCita;
import com.ceiba.usuario.modelo.dto.DtoMedico;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/citas")
@Api(tags={"Controlador consulta medicos"})
public class ConsultaControladorCitas {

    private final ManejadorListarCitas manejadorListarCitas;

    public ConsultaControladorCitas(ManejadorListarCitas manejadorListarCitas) {
        this.manejadorListarCitas = manejadorListarCitas;
    }

    @GetMapping
    @ApiOperation("Listar Usuarios")
    public List<DtoCita> listar() {
        return this.manejadorListarCitas.ejecutar();
    }

}
