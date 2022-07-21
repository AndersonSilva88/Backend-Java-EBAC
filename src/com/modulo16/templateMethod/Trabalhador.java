package com.modulo16.templateMethod;

public abstract class Trabalhador {

    public void executarRotina() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }

    private void irAoTrabalho() {
        System.out.println("Ir para o Trabalho");
    }

    public void iniciarRotina() {
        System.out.println("Iniciando Rotina");
    }

    public void levantar() {
        System.out.println("Levantando da cama");
    }
}
