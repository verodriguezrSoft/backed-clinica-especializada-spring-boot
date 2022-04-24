package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Medico;

public interface RepositorioMedico {
    /**
     * Permite crear un usuario
     * @param medico
     * @return el id generado
     */
    Long crear(Medico medico);

    /**
     * Permite actualizar un usuario
     * @param medico
     */
    void actualizar(Medico medico);

    /**
     * Permite eliminar un usuario
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un usuario con un nombre
     * @param nombre
     * @return si existe o no
     */
    boolean existe(String nombre);

    /**
     * Permite validar si existe un usuario con un nombre excluyendo un id
     * @return si existe o no
     */
    boolean existePorId(Long id);

}
