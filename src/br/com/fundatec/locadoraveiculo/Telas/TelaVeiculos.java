package br.com.fundatec.locadoraveiculo.Telas;

import br.com.fundatec.locadoraveiculo.bancodedados.DadosClientes;
import br.com.fundatec.locadoraveiculo.bancodedados.DadosVeiculos;
import br.com.fundatec.locadoraveiculo.enums.TipoPessoa;
import br.com.fundatec.locadoraveiculo.enums.TipoVeiculo;
import br.com.fundatec.locadoraveiculo.models.Cliente;
import br.com.fundatec.locadoraveiculo.models.Veiculo;

import java.util.Scanner;
import java.util.SortedMap;

public class TelaVeiculos {

    private Scanner scan = new Scanner(System.in);
    private DadosVeiculos dadosVeiculos = DadosVeiculos.make();

    public void printscreenvehicle() {

        boolean verify = true;


        while (verify) {

            System.out.println(
                    " escolha 1 para cadastrar Veículos (Carro, Moto ou Caminhão)  2 para listar Veículos  e  0 para voltar para menu prencepal");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("...");
                    cadastroveiculo();
                    break;
                case 2:
                    MostraVeiculo();
                    break;
                case 0:
                    verify = false;
                default:
                    System.out.println(" nao nao nao naaaaao");
                    break;

            }
        }


    }

    private void cadastroveiculo() {
        System.out.println("que tipo de caro vc é?");
        TipoVeiculo tipoVeiculo = TipoVeiculo.valueOf(scan.nextLine().toUpperCase());
        System.out.println("passa placa");
        String placa = scan.nextLine();


        System.out.println("passa marca");
        String marca = scan.nextLine();
        System.out.println("passa o modelo");
        String modelo = scan.nextLine();
        System.out.println("passa a kelometragem");
        float kilometragem = scan.nextFloat();
        System.out.println("passa o valor do kelometrorodado");
        double valorkmrodado = scan.nextDouble();
        System.out.println("passa o valor da diaria");
        double valordiaria = scan.nextDouble();
        Veiculo veiculo = new Veiculo(tipoVeiculo, placa, marca, modelo, kilometragem, valorkmrodado, valordiaria);
        System.out.println(veiculo.getTipoVeiculo());
        dadosVeiculos.add(veiculo);


    }

    public void MostraVeiculo() {
        for (Veiculo elemento : dadosVeiculos.getVeiculos()) {
            System.out.println("Dados do veiuclos: tipo veiculo = " + elemento.getTipoVeiculo() + ", Tipo placa = " + elemento.getPlaca()
                    + ", Tipo model = " + elemento.getModelo() + ", kilometragem = "
                    + elemento.getKilometragem() + ", valor do km roudardo = " + elemento.getValorkmrodado() + ", diaria = "
                    + elemento.getValordiaria());


        }

    }
}


