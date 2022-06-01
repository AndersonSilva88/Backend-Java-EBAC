package com.modulo12.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {

    public static void main(String[] args) {
        exemploListaSimples();
    }

    private  static void exemploListaSimples() {
        System.out.println("******* exemploListaSimples ********");
        Map<Integer, String> lista = new LinkedHashMap<>();
        lista.put(1, "Anderson");
        lista.put(2, "Cleberson");
        lista.put(3, "Lúcia");
        lista.put(4, "Joao");

        System.out.println(lista);
        System.out.println("");
    }
}
