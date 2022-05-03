package com.ceiba.citas.adaptador.dao;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.modelo.dto.DtoCita;
import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.puerto.dao.DaoCita;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoCitaMysql implements DaoCita {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="cita", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace="cita", value="obtenerCitasPorUsario")
    private static String sqlObtenerCitasPorUsario;


    public DaoCitaMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoCita> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoCita());
    }

    @Override
    public DtoCita obtenerCita(Long idCita) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("idCita", idCita);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlObtenerCitasPorUsario,paramSource, new MapeoCita());
    }
}
