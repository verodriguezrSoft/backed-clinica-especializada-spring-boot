package com.ceiba.dominio.excepcion;

public class ExcepcionDiasNoValidos extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ExcepcionDiasNoValidos(String message) {
        super(message);
    }
}
