package br.com.fundatec.locadoraveiculo.models;

import java.time.LocalDate;


public class Locacao{
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate datalocacao;

    public Locacao(Cliente cliente, Veiculo veiculo, LocalDate datalocacao) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.datalocacao = datalocacao;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public LocalDate getDatalocacao() {
        return datalocacao;
    }
}
