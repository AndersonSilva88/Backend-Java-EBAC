package com.modulo17.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Anderson");
        lista.add("1");
        //imprimir(lista);
        imprimir2(lista);

        List<Long> listLong = new ArrayList<>();
        listLong.add(1l);
        listLong.add(2l);
       // imprimir1(listLong);
        imprimir2(listLong);

        Long primeiroLong = pegarPrimeiroLista(listLong);
        System.out.println(primeiroLong);
    }

//    public static void imprimir(List<String> lista) {
//        for (String str : lista) {
//            System.out.println(str);
//        }
//    }

//    public static void imprimir1(List<Long> lista) {
//        for (Long str : lista) {
//            System.out.println(str);
//        }
//    }

    public static <T> void imprimir2(List<T> lista) {
        for (T str : lista) {
            System.out.println(str);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista) {
        return lista.get(0);
    }
}
