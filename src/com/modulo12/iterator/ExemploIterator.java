package com.modulo12.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Anderson");
        lista.add("Cleberson");
        lista.add("Lucia");
        lista.add("Joao");

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
