package com.ceiba.citas.consulta;

import com.ceiba.usuario.modelo.dto.DtoCita;
import com.ceiba.usuario.puerto.dao.DaoCita;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarCitas {

    private final DaoCita daoCita;

    public ManejadorListarCitas(DaoCita daoCita) {
        this.daoCita = daoCita;
    }

    public List<DtoCita> ejecutar() {
        return this.daoCita.listar();
    }

    public DtoCita ejecutarCitasUsuario(Long id) {
        return this.daoCita.obtenerCita(id);
    }
}
