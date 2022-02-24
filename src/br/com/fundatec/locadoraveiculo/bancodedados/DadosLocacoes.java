package br.com.fundatec.locadoraveiculo.bancodedados;

import br.com.fundatec.locadoraveiculo.models.Cliente;
import br.com.fundatec.locadoraveiculo.models.Locacao;

import java.util.LinkedList;
import java.util.List;

public class DadosLocacoes {


    private static DadosLocacoes instancia;

    public DadosLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    private List<Locacao> locacoes ;


    public static DadosLocacoes make() {
        if (instancia == null) {
            instancia = new DadosLocacoes(new LinkedList<>());
        }
        return instancia;
    }

    public void add(Locacao locacao) {
        this.locacoes.add(locacao);
    }

    public  List<Locacao> getLocacoes() {
        return locacoes;
    }


}
