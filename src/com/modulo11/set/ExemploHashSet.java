package com.modulo11.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaOrdemAscendente();

    }

    public static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<String> lista = new HashSet<>();
        lista.add("Anderson");
        lista.add("João");
        lista.add("Jairo");
        lista.add("Leticia");
        lista.add("Anderson");
        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploListaOrdemAscendente() {
        System.out.println("**** exemploListaOrdemAscendente ****");
        Set<String> lista = new HashSet<String>();
        lista.add("Anderson");
        lista.add("João");
        lista.add("Jairo");
        lista.add("Leticia");
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

    }

}
