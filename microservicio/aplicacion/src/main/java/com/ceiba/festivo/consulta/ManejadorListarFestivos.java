package com.ceiba.festivo.consulta;

import com.ceiba.usuario.modelo.dto.DtoCita;
import com.ceiba.usuario.modelo.dto.DtoFestivo;
import com.ceiba.usuario.puerto.dao.DaoCita;
import com.ceiba.usuario.puerto.dao.DaoFestivo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarFestivos {

    private final DaoFestivo daoFestivo;

    public ManejadorListarFestivos(DaoFestivo daoFestivo) {
        this.daoFestivo = daoFestivo;
    }

    public List<DtoFestivo> ejecutar() {
        return this.daoFestivo.listar();
    }
}
