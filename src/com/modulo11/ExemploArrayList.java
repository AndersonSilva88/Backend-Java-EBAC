package com.modulo11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();

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
        lista.add("Juliana");
        lista.add("Julia");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
