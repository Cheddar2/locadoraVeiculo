package br.com.fundatec.locadoraveiculo.Telas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

    public void imprimirMenu() {

        Scanner scan = new Scanner(System.in);
        boolean verify = true;

        while (verify) {
            System.out.println("escolha 1 para apresentar Tela de Veículos");
            System.out.println(" 2 para apresentar Tela de Clientes ");
            System.out.println(" 3 para apresentar Tela de Locações ");
            System.out.println(" e  0 para encerrar o progrema");
            int option = 0;
            try {
                option = scan.nextInt();
            } catch (InputMismatchException exception) {

                scan.nextLine();
                option = 0;

            }

            switch (option) {
                case 1:
                    TelaVeiculos TelaVeiculos = new TelaVeiculos();
                    TelaVeiculos.printscreenvehicle();
                    break;
                case 2:
                    TelaClientes telaCliente = new TelaClientes();
                    telaCliente.printscreenclient();
                    break;
                case 3:
                    TelaLocacoes Telalocacoes = new TelaLocacoes();
                    Telalocacoes.printscreentenancy();
                    break;
                case 0:
                    verify = false;
                default:
                    System.out.println(" nao nao nao naaaaao");
                    break;
            }
        }
        scan.close();
    }
}
