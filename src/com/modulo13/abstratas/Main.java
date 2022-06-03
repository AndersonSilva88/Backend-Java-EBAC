package com.modulo13.abstratas;

public class Main {

    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Anderson empregado");
        empregado.setSobrenome("Silva");
        empregado.setSalario(1000.0);
        imprimir(empregado);
        //System.out.println(empregado.getNome() + " Tem de salário R$: " + empregado.vencimento());


        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Anderson comissionado");
        comissionado.setSobrenome("Silva");
        comissionado.setTotalVenda(10000.0);
        comissionado.setTotalComissao(0.02);
        imprimir(comissionado);
        //System.out.println(comissionado.getNome() + " Teve venda total de R$: " + comissionado.getTotalVenda() + " Tem de comissao R$: " + comissionado.vencimento());

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Anderson horista");
        horista.setSobrenome("Silva");
        horista.setPrecoHora(10.0);
        horista.setTotalhoraTrabalhada(220.0);
        imprimir(horista);
        //System.out.println(horista.getNome() + " Tem valor de hora de R$: " + horista.getPrecoHora() + " Tem de salario no mes total R$: " + horista.vencimento());


    }

    public static void imprimir(Empregado empregado) {
        System.out.println(empregado.getNome() + " Tem salário: " + empregado.vencimento());
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
    }
}
