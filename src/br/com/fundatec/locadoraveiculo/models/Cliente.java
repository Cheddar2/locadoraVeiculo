package br.com.fundatec.locadoraveiculo.models;

import br.com.fundatec.locadoraveiculo.enums.TipoDocumento;
import br.com.fundatec.locadoraveiculo.enums.TipoPessoa;




import br.com.fundatec.locadoraveiculo.enums.TipoDocumento;
import br.com.fundatec.locadoraveiculo.enums.TipoPessoa;

    public class Cliente {
        private String nome;
        private TipoPessoa tipoPessoa;
        long documento;
        TipoDocumento tipoDocumento;
        String razaoSocial;
        long cnpj;
        Endereco endereco;

        public Cliente(String nome, TipoPessoa tipoPessoa, long documento, TipoDocumento tipoDocumento, String razaoSocial,
                       long cnpj, Endereco endereco) {
            this.nome = nome;
            this.tipoPessoa = tipoPessoa;
            this.documento = documento;
            this.tipoDocumento = tipoDocumento;
            this.razaoSocial = razaoSocial;
            this.cnpj = cnpj;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public TipoPessoa getTipoPessoa() {
            return tipoPessoa;
        }

        public void setTipoPessoa(TipoPessoa tipoPessoa) {
            this.tipoPessoa = tipoPessoa;
        }

        public long getDocumento() {
            return documento;
        }

        public void setDocumento(long documento) {
            this.documento = documento;
        }

        public TipoDocumento getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(TipoDocumento tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public String getRazaoSocial() {
            return razaoSocial;
        }

        public void setRazaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
        }

        public long getCnpj() {
            return cnpj;
        }

        public void setCnpj(long cnpj) {
            this.cnpj = cnpj;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }


        }



