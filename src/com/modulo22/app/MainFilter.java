package com.modulo22.app;

import com.modulo22.streams.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class MainFilter {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();
        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
    }
}
