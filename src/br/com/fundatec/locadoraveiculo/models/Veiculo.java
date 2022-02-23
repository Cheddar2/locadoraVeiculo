package br.com.fundatec.locadoraveiculo.models;

import br.com.fundatec.locadoraveiculo.enums.TipoVeiculo;

public class Veiculo {
            private TipoVeiculo tipoVeiculo;
            private String placa;
            private String marca;
            private String modelo;
            private  float kilometragem;
            private double  valorkmrodado;
            private double valordiaria;

    public Veiculo(TipoVeiculo tipoVeiculo, String placa, String marca, String modelo, float kilometragem, double valorkmrodado, double valordiaria) {
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometragem = kilometragem;
        this.valorkmrodado = valorkmrodado;
        this.valordiaria = valordiaria;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getKilometragem() {
        return kilometragem;
    }

    public double getValorkmrodado() {
        return valorkmrodado;
    }

    public double getValordiaria() {
        return valordiaria;
    }
}
