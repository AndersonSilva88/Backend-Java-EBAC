package com.modulo7;

import com.modulo7.Cliente;

public class PrimeiraClasse {


    public static void main(String args[]){

        Cliente cliente = new Cliente();

        cliente.setEndereco("Rua Alemanha");
        cliente.setCodigo(1);


        System.out.println(cliente.getEndereco());
        cliente.imprimirEndereco();

        String end = cliente.retornarNomeCliente();
        System.out.println(end);
        System.out.println(cliente.getValorTotal());


    }

}
