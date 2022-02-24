package br.com.fundatec.locadoraveiculo.models;

import br.com.fundatec.locadoraveiculo.enums.SituationLocacao;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate datalocacao;
    private  LocalDate dataentrega;
    private BigDecimal valor;
    private SituationLocacao situation;

    public Locacao(Cliente cliente, Veiculo veiculo, LocalDate datalocacao, LocalDate dataentrega, BigDecimal valor, SituationLocacao situation) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.datalocacao = datalocacao;
        this.dataentrega = dataentrega;
        this.valor = valor;
        this.situation = situation;
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

    public LocalDate getDataentrega() {
        return dataentrega;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public SituationLocacao getSituation() {
        return situation;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "cliente=" + cliente +
                ", veiculo=" + veiculo +
                ", datalocacao=" + datalocacao +
                ", dataentrega=" + dataentrega +
                ", valor=" + valor +
                ", situation=" + situation +
                '}';
    }
}