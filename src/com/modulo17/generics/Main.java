package com.modulo17.generics;

import com.modulo17.generics.fruta.Banana;
import com.modulo17.generics.fruta.Fruta;
import com.modulo17.generics.fruta.Maca;

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
        System.out.println("-------------------");
        String primeiroLista = pegarPrimeiroLista(lista);
        System.out.println(primeiroLista);
        System.out.println("-------------------");
        Long primeiroLong = pegarPrimeiroLista(listLong);
        System.out.println(primeiroLong);

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());

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

    public static void imprimirFrutas(List<Fruta> lista) {
        for (Fruta fruta : lista) {
            System.out.println(fruta);
        }
    }
}
