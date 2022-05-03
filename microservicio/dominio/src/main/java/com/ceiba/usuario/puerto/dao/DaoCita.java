package com.ceiba.usuario.puerto.dao;

import com.ceiba.usuario.modelo.dto.DtoCita;
import com.ceiba.usuario.modelo.entidad.Cita;

import java.util.List;

public interface DaoCita {
    List<DtoCita> listar();

    /**
     * Permite validar si existe un usuario con un nombre excluyendo un id
     * @Regresar id, usuario
     */
    DtoCita obtenerCita(Long idCita);
}
