package dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {


    @Override
    public void mover() {
        System.out.println("Robo move-se Agresivamentomente");
    }
}
