package com.ceiba.festivo.adaptador.dao;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.modelo.dto.DtoFestivo;
import com.ceiba.usuario.puerto.dao.DaoFestivo;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DaoFestivoMysql implements DaoFestivo {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="festivo", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace="festivo", value="existePorFecha")
    private static String sqlFechaCita;

    public DaoFestivoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoFestivo> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoFestivo());
    }

    @Override
    public boolean getFechaCita(LocalDateTime actual) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("anio", actual.getYear());
        params.addValue("mes", actual.getMonthValue());
        params.addValue("dia", actual.getDayOfMonth());
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlFechaCita, params, Boolean.class);
    }
}
