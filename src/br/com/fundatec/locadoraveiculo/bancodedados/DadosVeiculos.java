package br.com.fundatec.locadoraveiculo.bancodedados;


import br.com.fundatec.locadoraveiculo.models.Veiculo;

import java.util.LinkedList;
import java.util.List;

public class DadosVeiculos {
    private static DadosVeiculos instancia;

    public DadosVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;

    }
    private List<Veiculo>veiculos ;
    public static DadosVeiculos make() {
        if (instancia == null) {
            instancia = new DadosVeiculos(new LinkedList<>());
        }
        return instancia;
    }
    public void add(Veiculo veiculo) {this.veiculos.add(veiculo);}
    public  List<Veiculo>getVeiculos(){return veiculos;}
}
