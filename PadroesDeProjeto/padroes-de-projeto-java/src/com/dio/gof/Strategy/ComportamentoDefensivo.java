package com.dio.gof.Strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("movendo-se defensivamente");
    }
}
