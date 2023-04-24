package com.dio.gof;

import com.dio.gof.Facade.Facade;
import com.dio.gof.SIngleton.SingletonEager;
import com.dio.gof.SIngleton.SingletonLazy;
import com.dio.gof.SIngleton.SingletonLazyHolder;
import com.dio.gof.Strategy.*;

public class Test {
   public static void main(String[] args) {
    //Singleton

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);

    //Strategy

       Comportamento defensivo = new ComportamentoDefensivo();
       Comportamento normal = new ComportamentoNormal();
       Comportamento agressivo = new ComportamentoAgressivo();

       Robo robo =new Robo();
       robo.setComportamento(normal);
       robo.mover();
       robo.mover();
       robo.setComportamento(defensivo);
       robo.mover();
       robo.mover();
       robo.setComportamento(agressivo);
       robo.mover();

       //Facade

       Facade facede = new Facade();
       facede.migrarCliente("Jessica", "11475887");
    }

}
