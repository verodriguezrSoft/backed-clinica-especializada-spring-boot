package com.ceiba.medico.controlado;

import com.ceiba.citas.consulta.ManejadorListarCitas;
import com.ceiba.medico.consulta.ManejadorListarMedicos;
import com.ceiba.usuario.modelo.dto.DtoMedico;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medicos")
@Api(tags={"Controlador consulta medicos"})
public class ConsultaControladorMedico {

    private final ManejadorListarMedicos manejadorListarMedicos;


    public ConsultaControladorMedico(ManejadorListarMedicos manejadorListarMedicos) {
        this.manejadorListarMedicos = manejadorListarMedicos;
    }

    @GetMapping
    @ApiOperation("Listar Usuarios")
    public List<DtoMedico> listar() {
        return this.manejadorListarMedicos.ejecutar();
    }


}
