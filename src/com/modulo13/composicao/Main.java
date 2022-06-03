package com.modulo13.composicao;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setCodigo(10l);
        banco.setNome("Banco Santander");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);

    }
}
