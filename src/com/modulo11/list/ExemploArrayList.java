package com.modulo11.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumero();

    }

    private static void exemploNumero() {
        System.out.println("*** exemploNumero ***");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);
    }


    private static void exemploListaSimples() {
        System.out.println("*** exemploListaSimples ***");
        List<String> lista = new ArrayList<String>();
        lista.add("Anderson");
        lista.add("Davi");
        lista.add("Cleberson");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("*** exemploListaSimplesOrdemAscendente ***");
        List<String> lista = new ArrayList<>();
        lista.add("Jeferson");
        lista.add("André");
        lista.add("Bruno");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }


}
