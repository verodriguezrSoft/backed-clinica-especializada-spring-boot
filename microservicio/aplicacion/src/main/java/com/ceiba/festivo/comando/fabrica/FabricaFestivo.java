package com.ceiba.festivo.comando.fabrica;

import com.ceiba.festivo.comando.ComandoFestivo;
import com.ceiba.usuario.modelo.entidad.Festivo;
import org.springframework.stereotype.Component;

@Component
public class FabricaFestivo {

    public Festivo crear(ComandoFestivo comandoFestivo){
        return new Festivo(
            comandoFestivo.getId(),
            comandoFestivo.getDia(),
            comandoFestivo.getMesNumerico(),
            comandoFestivo.getAnio()
        );
    }
}
