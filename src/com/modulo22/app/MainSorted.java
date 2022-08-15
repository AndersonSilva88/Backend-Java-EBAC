package com.modulo22.app;

import com.modulo22.streams.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainSorted {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream<Pessoa> stream1 =  lista.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade));

        Stream<Pessoa> stream2 = lista.stream()
                .sorted((p1,p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
    }
}
