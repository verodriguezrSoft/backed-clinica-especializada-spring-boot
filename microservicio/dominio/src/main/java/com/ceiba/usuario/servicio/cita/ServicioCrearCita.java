package com.ceiba.usuario.servicio.cita;

import com.ceiba.dominio.excepcion.ExcepcionDiasNoValidos;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.enums.Especialidades;
import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.puerto.dao.DaoFestivo;
import com.ceiba.usuario.puerto.repositorio.RepositorioCita;
import com.ceiba.usuario.utils.ConversionFechas;

import java.math.BigDecimal;
import java.util.Calendar;


public class ServicioCrearCita {

    private static final String LA_CITA_YA_EXISTE_EN_EL_SISTEMA = "La cita ya existe";
    private static final String SABADOS_Y_DOMINGOS_NO_SE_HACEN_CITAS = "Los días sábados y dignas no se pueden hacer citas";

    private final RepositorioCita repositorioCita;

    private final DaoFestivo daoFestivo;

    public ServicioCrearCita(RepositorioCita repositorioCita, DaoFestivo daoFestivo) {
        this.repositorioCita = repositorioCita;
        this.daoFestivo = daoFestivo;
    }

    public Long ejecutar(Cita cita) {
        validarExistenciaPrevia(cita);
        calcularDiaCita(cita);
        validarDiaFindeSemana(cita);
        validarSiEsfestivo(cita);
        return this.repositorioCita.crear(cita);
    }

    private void validarExistenciaPrevia(Cita cita) {
        boolean existe = this.repositorioCita.existePorId(cita.getId());
        if (existe) {
            throw new ExcepcionDuplicidad(LA_CITA_YA_EXISTE_EN_EL_SISTEMA);
        }
    }

    private void validarDiaFindeSemana(Cita cita) {
        Calendar actualCalendar = ConversionFechas.localDateTimeToCalendar(cita.getFechaCita());
        int diaSeleccinado = actualCalendar.get(Calendar.DAY_OF_WEEK);
        if (diaSeleccinado == Calendar.SATURDAY || diaSeleccinado == Calendar.SUNDAY) {
            throw new ExcepcionDiasNoValidos(SABADOS_Y_DOMINGOS_NO_SE_HACEN_CITAS);
        }
    }

    private void calcularDiaCita(Cita cita) {
        Calendar actualCalendar = ConversionFechas.localDateTimeToCalendar(cita.getFechaCita());
        boolean diaValido = false;
        while (!diaValido) {
            actualCalendar.add(Calendar.DAY_OF_WEEK, 1);
            int diaSeleccinado = actualCalendar.get(Calendar.DAY_OF_WEEK);
            if (diaSeleccinado == Calendar.SATURDAY || diaSeleccinado == Calendar.SUNDAY) {
                continue;
            }
            diaValido = true;
        }
        cita.setFechaCita(ConversionFechas.calendarToLocalDateTime(actualCalendar));
    }


    private void validarSiEsfestivo(Cita cita) {
        boolean esFestivo = daoFestivo.getFechaCita(cita.getFechaCita());
        if (!esFestivo) {
            cita.setPrecioCita(Especialidades.getById(cita.getIdEspecialidad()).getValorEspecialidad());
            return;
        }

        BigDecimal dobleValorFestivo = new BigDecimal("2");
        BigDecimal valorFinal = Especialidades.getById(cita.getIdEspecialidad()).getValorEspecialidad().multiply(dobleValorFestivo);
        cita.setPrecioCita(valorFinal);
    }
}
