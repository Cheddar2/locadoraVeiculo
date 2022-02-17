package br.com.fundatec.locadoraveiculo.Telas;

import java.util.Scanner;

public class TelaLocacoes {
    public void printscreentenancy() {
        Scanner scan = new Scanner(System.in);
        boolean verify = true;

        while (verify) {

            System.out.println(
                    " escolha 1 para cadastrar Locações  2 encerrar Locações 3  para listar Locações  e  0 para voltar para menu prencepal");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("...");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    verify = false;
                default:
                    System.out.println(" nao nao nao naaaaao");
                    break;

            }
        }
    }
}

