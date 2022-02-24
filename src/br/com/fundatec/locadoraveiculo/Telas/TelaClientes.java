package br.com.fundatec.locadoraveiculo.Telas;

import br.com.fundatec.locadoraveiculo.bancodedados.DadosClientes;
import br.com.fundatec.locadoraveiculo.enums.TipoDocumento;
import br.com.fundatec.locadoraveiculo.enums.TipoPessoa;
import br.com.fundatec.locadoraveiculo.models.Cliente;
import br.com.fundatec.locadoraveiculo.models.Endereco;

import java.util.Locale;
import java.util.Scanner;

public class TelaClientes {
    Scanner scan = new Scanner(System.in);
    private  DadosClientes dadosClientes =  DadosClientes.make();
    public void printscreenclient() {
        boolean verify = true;

        while (verify) {

            System.out.println(
                    " escolha 1 para cadastrar Clientes 2 listar Clientes  e  0 para voltar para menu prencepal");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("...");
                    cadastrocliente();
                    break;
                case 2:
                    MostraCliente();

                    break;
                case 0:
                    verify = false;
                default:
                    System.out.println(" nao nao nao naaaaao");
                    break;

            }
        }
    }

    private void cadastrocliente() {
        long cnpj = 0;
        long documento = 0;
        String nome = "";
        String razaoSocial = "";
        TipoDocumento tipoDocumento = TipoDocumento.valueOf("CPF");
        System.out.println("Qual tipo de pessoa vc é, fisica ou joueridica");
        TipoPessoa tipoPessoa = TipoPessoa.valueOf(scan.nextLine().toUpperCase());


        if (tipoPessoa.equals(TipoPessoa.JURIDICA)) {
            System.out.println("parabens vc é uma pessoa joueridica");
            tipoDocumento = TipoDocumento.valueOf("CNPJ");
            System.out.println("Informe o CNPJ");
            cnpj = scan.nextLong();
            scan.nextLine();
            System.out.println("Informe a razão Social");
            razaoSocial = scan.nextLine();
            System.out.println("passa endereço");
            String logradouro = scan.nextLine();
            System.out.println("passa numero");
            int numero = scan.nextInt();
            scan.nextLine();
            System.out.println("passa complemento.");
            String complemento = scan.nextLine();
            System.out.println("passa cidade.");
            String cidade = scan.nextLine();
            System.out.println("passa bairro.");
            String bairro = scan.nextLine();
            System.out.println("passa unidade federal.");
            String uf = scan.next().toUpperCase();
            System.out.println("passa CEP.");
            long cep = scan.nextLong();
            Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, uf, cep);
            Cliente cliente = new Cliente( tipoPessoa, razaoSocial, cnpj, endereco);
            System.out.println(cliente.getTipoPessoa());
            dadosClientes.add(cliente);





        } else if (tipoPessoa.equals(TipoPessoa.FISICA)) {
            System.out.println("parabens vc é uma pessoa fisica");

            System.out.println("e infome seu name ");

            nome = scan.nextLine();

            System.out.println("qual tipo de documento o senhor(a) gostaria usar ");


            tipoDocumento = TipoDocumento.valueOf(scan.next().toUpperCase());
            System.out.println("passa o documento");
            documento = scan.nextLong();
            scan.nextLine();
            System.out.println("passa endereço");
            String logradouro = scan.nextLine();
            System.out.println("passa numero");
            int numero = scan.nextInt();
            scan.nextLine();
            System.out.println("passa complemento.");
            String complemento = scan.nextLine();
            System.out.println("passa cidade.");
            String cidade = scan.nextLine();
            System.out.println("passa bairro.");
            String bairro = scan.nextLine();
            System.out.println("passa unidade federal.");
            String uf = scan.next().toUpperCase();
            System.out.println("passa CEP.");

            long cep = scan.nextLong();

            Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, uf, cep);
            Cliente cliente = new Cliente(nome, tipoPessoa, documento, tipoDocumento,  endereco);
            System.out.println(cliente.getTipoPessoa());
            dadosClientes.add(cliente);

        }


    }
        public void MostraCliente() {
            for (Cliente elemento : dadosClientes.getClientes()) {
                System.out.println("Dados do cloente: nome = " + elemento.getNome() + ", Tipo documento = " + elemento.getTipoDocumento()
                        + ", Tipo pessoa = " + elemento.getTipoPessoa() + ", documento = "
                        + elemento.getDocumento() + ", Razão Social = " + elemento.getRazaoSocial() + ", CNPJ = "
                        + elemento.getCnpj() + ", Endereço = " + elemento.getEndereco());

            }


        }}

