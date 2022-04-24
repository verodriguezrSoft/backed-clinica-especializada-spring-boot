package com.ceiba.citas.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoCita;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class MapeoCita implements RowMapper<DtoCita>, MapperResult {
    @Override
    public DtoCita mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        Long idUsuario = resultSet.getLong("id_usuario");
        LocalDateTime fechaCita = extraerLocalDateTime(resultSet,"fecha_cita");
        LocalDateTime fechaActualizacion = extraerLocalDateTime(resultSet,"fecha_actualizacion");
        Long idEspecialidad = resultSet.getLong("id_especialidad");
        BigDecimal precioCita = resultSet.getBigDecimal("precio_cita");
        Long idMedico = resultSet.getLong("id_medico");
        BigDecimal valorTRM = resultSet.getBigDecimal("valor_trm");
        String tipoMoneda = resultSet.getString("tipo_moneda");

        return new DtoCita(id, idUsuario, fechaCita, fechaActualizacion, idEspecialidad, idMedico, precioCita, valorTRM, tipoMoneda);
    }
}
