package com.ceiba.festivo.adaptador.respository;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RespositorioFestivo;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioFestivoMysql implements RespositorioFestivo {
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="festivo", value="crear")
    private static String sqlCrear;

    @SqlStatement(namespace="festivo", value="actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace="festivo", value="eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace="festivo", value="existe")
    private static String sqlExiste;

    @SqlStatement(namespace="festivo", value="existePorFecha")
    private static String sqlExistePorFecha;

    @SqlStatement(namespace="festivo", value="existePorId")
    private static String sqlExistePorId;


    public RepositorioFestivoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public Long crear(Festivo festivo) {
        return this.customNamedParameterJdbcTemplate.crear(festivo, sqlCrear);
    }

    @Override
    public void actualizar(Festivo festivo) {
        this.customNamedParameterJdbcTemplate.actualizar(festivo, sqlActualizar);
    }

    @Override
    public void eliminar(Festivo festivo) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("anio", festivo.getAnio());
        paramSource.addValue("mes", festivo.getMesNumerico());
        paramSource.addValue("dia", festivo.getDia());

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);
    }


    @Override
    public boolean exitePorFecha(Festivo festivo) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("anio", festivo.getAnio());
        paramSource.addValue("mes", festivo.getMesNumerico());
        paramSource.addValue("dia", festivo.getDia());

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExistePorFecha, paramSource, Boolean.class);
    }

    @Override
    public boolean exitePorId(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExistePorId,paramSource, Boolean.class);
    }


}
