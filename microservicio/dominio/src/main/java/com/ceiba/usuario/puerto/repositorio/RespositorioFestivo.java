package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.modelo.entidad.Medico;

public interface RespositorioFestivo {
    /**
     * Permite crear un festivo
     * @param festivo
     * @return el id generado
     */
    Long crear(Festivo festivo);

    /**
     * Permite actualizar un festivo
     * @param festivo
     */
    void actualizar(Festivo festivo);

    /**
     * Permite eliminar un festivo
     * @param festivo
     */
    void eliminar(Festivo festivo);

    /**
     * Permite eliminar un festivo
     * @param festivo
     */
    boolean exitePorFecha(Festivo festivo);

    /**
     * Permite eliminar un festivo
     * @param id
     */
    boolean exitePorId(Long id);

}
