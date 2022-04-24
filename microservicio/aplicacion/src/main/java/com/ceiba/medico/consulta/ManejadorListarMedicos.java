package com.ceiba.medico.consulta;

import com.ceiba.usuario.modelo.dto.DtoMedico;
import com.ceiba.usuario.puerto.dao.DaoMedico;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarMedicos {

    private final DaoMedico daoMedico;

    public ManejadorListarMedicos(DaoMedico daoMedico) {
        this.daoMedico = daoMedico;
    }

    public List<DtoMedico> ejecutar(){
        return this.daoMedico.listar();
    }
}
