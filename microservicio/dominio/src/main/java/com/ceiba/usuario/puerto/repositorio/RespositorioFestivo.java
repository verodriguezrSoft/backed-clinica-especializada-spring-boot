package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.modelo.entidad.Medico;

public interface RespositorioFestivo {
    /**
     * Permite crear un usuario
     * @param festivo
     * @return el id generado
     */
    Long crear(Festivo festivo);

    /**
     * Permite actualizar un usuario
     * @param festivo
     */
    void actualizar(Festivo festivo);

    /**
     * Permite eliminar un usuario
     * @param id
     */
    void eliminar(Long id);
}
