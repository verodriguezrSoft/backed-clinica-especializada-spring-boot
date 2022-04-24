package com.ceiba.medico.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoMedico;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoMedico implements RowMapper<DtoMedico>, MapperResult {
    @Override
    public DtoMedico mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        String especialidad = resultSet.getString("especialidad");

        return new DtoMedico(id, nombre, especialidad);
    }
}
