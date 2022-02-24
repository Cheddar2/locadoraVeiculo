package br.com.fundatec.locadoraveiculo.models;

public class Endereco {
    private String logradouro;
    private int numero;
   private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private long cep;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String uf, long cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", cep=" + cep +
                '}';
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
