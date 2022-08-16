package com.modulo22.app;

import com.modulo22.streams.Pessoa;

import java.util.List;

public class MainForEach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        System.out.println("***** Lista de pessoas *******");
        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("***** Nacionalidade ******");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Argentino"))
                .forEach(person -> System.out.println(person.getNome()));
        System.out.println("***** Filtro por idade ******");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(p -> System.out.println(p));

    }
}
