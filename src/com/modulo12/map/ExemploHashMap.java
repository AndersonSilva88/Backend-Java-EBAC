package com.modulo12.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploHashMap {

    //permite chaves e valores null, não existe garantia que os dados ficarão ordenador.

    //para usar uma classe que implemente Map, quaisquer classes que forem utilizadas como chave,
    //devem sobresrever os métodos hashcode()  e equals().

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesIterandoChaveValor();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoValores();
    }

    private static void exemploListaSimplesIterandoChaveValor() {
        System.out.println("***** exemploListaSimplesIterandoChaveValor *****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Anderson");
        lista.put(2, "Cleberson");
        lista.put(3, "Lúcia");
        lista.put(4, "Joao");

        System.out.println("******* For comum *******");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e: entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("***** forEach stream *****");
        lista.entrySet().forEach(e ->{
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("******* forEach stream 1 ******");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("******* forEach stream 2 *******");
        lista.values().stream().forEach(System.out::println);

        System.out.println("******* forEach stream 3 *******");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("******* Iterator ********");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("********** exemploListaSimplesIterandoChaves *************");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Anderson");
        lista.put(2, "Cleberson");
        lista.put(3, "Lúcia");
        lista.put(4, "Joao");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("********** exemploListaSimplesIterandoValores *************");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Anderson");
        lista.put(2, "Cleberson");
        lista.put(3, "Lúcia");
        lista.put(4, "Joao");

        for (String value : lista.values()){
            System.out.println(value);
        }
    }

    private static void exemploListaSimples() {
        System.out.println("******* exemploListaSimples ********");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Anderson");
        lista.put(2, "Cleberson");
        lista.put(3, "Lúcia");
        lista.put(4, "Joao");

        System.out.println(lista);
        System.out.println(" ");
    }
}
