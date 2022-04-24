package com.ceiba.usuario.puerto.dao;

import com.ceiba.usuario.modelo.dto.DtoFestivo;

import java.time.LocalDateTime;
import java.util.List;

public interface DaoFestivo {
    List<DtoFestivo> listar();

    boolean getFechaCita(LocalDateTime actual);
}
