package com.modulo12.map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();

    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("******** exemploListaSimplesIterandoChaves() ********");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Bruna");
        lista.put(2, "Cleberson");
        lista.put(3, "Anderson");
        lista.put(4, "Lúcia");
        lista.put(5, "Joao");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("******** exemploListaSimplesIterandoValores *******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Bruna");
        lista.put(2, "Cleberson");
        lista.put(3, "Anderson");
        lista.put(4, "Lúcia");
        lista.put(5, "Joao");

        for (String value: lista.values()) {
            System.out.println(value);
        }
    }

    //garante a ordenacao ascendente
    //nunca repete chave
    private static void exemploListaSimples() {
        System.out.println("******** exemploListaSimples *******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Bruna");
        lista.put(2, "Cleberson");
        lista.put(3, "Anderson");
        lista.put(4, "Lúcia");
        lista.put(5, "Joao");

        System.out.println(lista);
        System.out.println("");
    }
}
