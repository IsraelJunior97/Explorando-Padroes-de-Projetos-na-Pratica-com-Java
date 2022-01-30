package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.*;

public class Teste {

    public static void main(String[] args) {

        // Teste relacionados ao design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy= SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager =SingletonEager.getInstancia();
        System.out.println(eager);
        eager= SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder =SingletonLazyHolder.getInstancia();
        System.out.println( lazyHolder);
        lazyHolder= SingletonLazyHolder.getInstancia();
        System.out.println( lazyHolder);
        System.out.println("-------");

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // facade

        Facade facade = new Facade();
        facade.migraCliente("Israel","554555");




    }
}
