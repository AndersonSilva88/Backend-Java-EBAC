package com.modulo22.app;

import com.modulo22.streams.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class MainCollect {

    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().popularPessoas();

        List<Pessoa> listaB = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());
        listaB.forEach(System.out::println);

        System.out.println("***********");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("************");
        Set<Pessoa> set = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println("************");
        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));
        arrayList.forEach(System.out::println);
        System.out.println("************");
//        TreeSet<Pessoa> tree = lista.stream()
//                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
//                .collect(Collectors.toCollection(TreeSet::new));
//        tree.forEach(System.out::println);
        Map<Integer, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));
        map.forEach((k,v) -> System.out.println(v));
        System.out.println("**************");
        Map<Integer, List<Pessoa>> agrupaPorIdade = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        agrupaPorIdade.forEach((k,v) -> System.out.println(k + " / " + v));
    }
}
