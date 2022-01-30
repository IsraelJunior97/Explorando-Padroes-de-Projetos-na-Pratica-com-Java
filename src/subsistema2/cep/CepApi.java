package subsistema2.cep;

import dio.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recupearCidade(String cep){
        return "São Paulo";

    }

    public String recupearEstado(String estado){
        return "SP";

    }



}
