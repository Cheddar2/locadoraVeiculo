package br.com.fundatec.locadoraveiculo;

import br.com.fundatec.locadoraveiculo.Telas.MenuPrincipal;

import java.util.Scanner;

public class LocadoraVeiculo {
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.imprimirMenu();


    }
}

