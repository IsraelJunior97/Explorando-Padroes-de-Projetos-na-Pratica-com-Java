package dio.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {


    @Override
    public void mover() {
        System.out.println("Robo move-se Devensivamente");
    }
}