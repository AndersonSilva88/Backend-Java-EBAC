package com.modulo16.oberver;

public class Main {

    public static void main(String[] args) {
        Jornalista jornalista = new Jornalista();
        jornalista.add(new TV());
        jornalista.notifyAll("teste");
    }
}
