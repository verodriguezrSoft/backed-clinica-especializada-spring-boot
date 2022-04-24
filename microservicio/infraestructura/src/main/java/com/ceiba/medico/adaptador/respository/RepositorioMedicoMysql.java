package com.ceiba.medico.adaptador.respository;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMedicoMysql implements RepositorioMedico {
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="medico", value="crear")
    private static String sqlCrear;

    @SqlStatement(namespace="medico", value="actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace="medico", value="eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace="medico", value="existe")
    private static String sqlExiste;

    @SqlStatement(namespace="medico", value="existePorId")
    private static String sqlExistePorId;

    public RepositorioMedicoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public Long crear(Medico medico) {
        return this.customNamedParameterJdbcTemplate.crear(medico, sqlCrear);
    }

    @Override
    public void actualizar(Medico medico) {
        this.customNamedParameterJdbcTemplate.actualizar(medico, sqlActualizar);
    }

    @Override
    public void eliminar(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);

    }

    @Override
    public boolean existe(String nombre) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("nombre", nombre);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste,paramSource, Boolean.class);
    }

    @Override
    public boolean existePorId(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExistePorId,paramSource, Boolean.class);

    }
}
