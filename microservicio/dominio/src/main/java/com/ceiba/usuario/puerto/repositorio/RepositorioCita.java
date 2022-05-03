package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.modelo.entidad.Festivo;

public interface RepositorioCita {
    /**
     * Permite crear un usuario
     * @param cita
     * @return el id generado
     */
    Long crear(Cita cita);

    /**
     * Permite actualizar un usuario
     * @param cita
     */
    void actualizar(Cita cita);

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
