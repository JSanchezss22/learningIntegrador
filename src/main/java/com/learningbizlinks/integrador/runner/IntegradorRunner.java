package com.learningbizlinks.integrador.runner;

import com.learningbizlinks.integrador.methods.*;

public class IntegradorRunner

{

    private Integraciones integraciones;

    public IntegradorRunner(Integraciones integraciones) {
        this.integraciones = integraciones;
    }

    public void run() {

        System.out.println("iniciando metodo: " + integraciones.toString());

        integraciones.valida();
        integraciones.publica();
        integraciones.declara();
        integraciones.consulta();

    }
}
