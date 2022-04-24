package com.ceiba.usuario.servicio.festivo;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Festivo;
import com.ceiba.usuario.modelo.entidad.Medico;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RespositorioFestivo;


public class ServicioCrearFestivo {

    private static final String EL_FESTIVO_YA_EXISTE = "El festivo ya existe";

    private final RespositorioFestivo repRespositorioFestivo;

    public ServicioCrearFestivo(RespositorioFestivo repRespositorioFestivo) {
        this.repRespositorioFestivo = repRespositorioFestivo;
    }

    public Long ejecutar(Festivo festivo) {
        validarExistenciaPrevia(festivo);
        return this.repRespositorioFestivo.crear(festivo);
    }

    private void validarExistenciaPrevia(Festivo festivo) {
        boolean existe = this.repRespositorioFestivo.exitePorFecha(festivo);
        if(existe) {
            throw new ExcepcionDuplicidad(EL_FESTIVO_YA_EXISTE);
        }
    }
}
