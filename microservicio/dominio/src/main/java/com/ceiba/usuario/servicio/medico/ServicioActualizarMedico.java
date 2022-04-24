package com.ceiba.usuario.servicio.medico;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;

public class ServicioActualizarMedico {

    private static final String EL_MEDICO_NO_EXISTE_EN_EL_SISTEMA = "El medico no existe en el sistema";

    private final RepositorioMedico repositorioMedico;

    public ServicioActualizarMedico(RepositorioMedico repositorioMedico) {
        this.repositorioMedico = repositorioMedico;
    }

    public void ejecutar(Medico medico) {
        validarExistenciaPrevia(medico);
        this.repositorioMedico.actualizar(medico);
    }

    private void validarExistenciaPrevia(Medico medico) {
        boolean existe = this.repositorioMedico.existePorId(medico.getId());
        if(!existe) {
            throw new ExcepcionDuplicidad(EL_MEDICO_NO_EXISTE_EN_EL_SISTEMA);
        }
    }
}
