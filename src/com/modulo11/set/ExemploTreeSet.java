package com.modulo11.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<String> lista = new TreeSet<>();
        lista.add("João");
        lista.add("Antonio");
        lista.add("Lúcia");
        lista.add("João");
        System.out.println(lista);
        System.out.println("");
    }

}
