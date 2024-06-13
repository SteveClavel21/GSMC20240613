package org.example;

public class OperacionesMatematicasGSMC {


    public static double raizcuadradacal(double numero){

        if(numero < 0.0) throw new IllegalArgumentException("no ingresar negativos");

        return Math.sqrt(numero);
    }

}
