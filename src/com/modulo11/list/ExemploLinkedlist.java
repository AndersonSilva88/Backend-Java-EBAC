package com.modulo11.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedlist {


    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();

    }

    private static void exemploListaSimples() {
        System.out.println("*** exemploListaSimples ***");
        List<String> lista = new LinkedList<>();
        lista.add("Anderson");
        lista.add("Davi");
        lista.add("Cleberson");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("*** exemploListaSimplesOrdemAscendente ***");
        List<String> lista = new LinkedList<>();
        lista.add("Jeferson");
        lista.add("André");
        lista.add("Bruno");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }






}
