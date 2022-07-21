package com.modulo16.templateMethod;

public class Main {
    public static void main(String[] args) {
        Trabalhador bombeiro = new Bombeiro();
        bombeiro.executarRotina();

        System.out.println("=====================");

        Trabalhador policial = new Policial();
        policial.executarRotina();
    }
}
