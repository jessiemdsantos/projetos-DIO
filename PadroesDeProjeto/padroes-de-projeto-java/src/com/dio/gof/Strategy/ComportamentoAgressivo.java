package com.dio.gof.Strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("movendo-se agressivamente");
    }
}
