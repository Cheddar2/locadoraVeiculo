package br.com.fundatec.locadoraveiculo.bancodedados;

import br.com.fundatec.locadoraveiculo.models.Cliente;

import java.util.LinkedList;
import java.util.List;

public class DadosClientes {
    private static DadosClientes instancia;

    public DadosClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    private List<Cliente> clientes ;


    public static DadosClientes make() {
        if (instancia == null) {
            instancia = new DadosClientes(new LinkedList<>());
        }
        return instancia;
    }

    public void add(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public  List<Cliente> getClientes() {
        return clientes;
    }


}
