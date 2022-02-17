package br.com.fundatec.locadoraveiculo.models;

public class Endereco {
    String logradouro;
    int numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
    long cep;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String uf, long cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public long getCep() {
        return cep;
    }
}
