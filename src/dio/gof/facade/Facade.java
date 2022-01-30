package dio.gof.facade;


import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migraCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recupearCidade(cep);
        String estado = CepApi.getInstancia().recupearCidade(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }
}
