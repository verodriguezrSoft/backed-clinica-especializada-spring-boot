package com.ceiba.usuario.servicio.festivo;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RespositorioFestivo;

public class ServicioActualizarFestivo {

    private static final String EL_FESTIVO_NO_EXISTE_EN_EL_SISTEMA = "El festivo no existe en el sistema";

    private final RespositorioFestivo repRespositorioFestivo;

    public ServicioActualizarFestivo(RespositorioFestivo repRespositorioFestivo) {
        this.repRespositorioFestivo = repRespositorioFestivo;
    }

    public void ejecutar(Festivo festivo) {
        validarExistenciaPrevia(festivo);
        this.repRespositorioFestivo.actualizar(festivo);
    }

    private void validarExistenciaPrevia(Festivo festivo) {
        boolean existe = this.repRespositorioFestivo.exitePorId(festivo.getId());
        if(!existe) {
            throw new ExcepcionDuplicidad(EL_FESTIVO_NO_EXISTE_EN_EL_SISTEMA);
        }
    }
}
