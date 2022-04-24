package com.ceiba.usuario.servicio.medico;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;


public class ServicioCrearMedico {

    private static final String EL_MEDICO_YA_EXISTE_EN_EL_SISTEMA = "El medico ya existe en el sistema";

    private final RepositorioMedico repositorioMedico;

    public ServicioCrearMedico(RepositorioMedico repositorioUsuario) {
        this.repositorioMedico = repositorioUsuario;
    }

    public Long ejecutar(Medico medico) {
        validarExistenciaPrevia(medico);
        return this.repositorioMedico.crear(medico);
    }

    private void validarExistenciaPrevia(Medico medico) {
        boolean existe = this.repositorioMedico.existe(medico.getNombre());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_MEDICO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
