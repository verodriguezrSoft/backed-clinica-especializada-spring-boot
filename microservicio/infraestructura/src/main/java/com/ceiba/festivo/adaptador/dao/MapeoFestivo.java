package com.ceiba.festivo.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoFestivo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoFestivo implements RowMapper<DtoFestivo>, MapperResult {
    @Override
    public DtoFestivo mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        long id = resultSet.getLong("id");
        int dia = resultSet.getInt("dia");
        int mesNumerico = resultSet.getInt("mes_numerico");
        int anio = resultSet.getInt("anio");

        return new DtoFestivo(id, dia, mesNumerico, anio);
    }
}
