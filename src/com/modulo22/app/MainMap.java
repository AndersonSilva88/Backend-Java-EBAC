package com.modulo22.app;

import com.modulo22.streams.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class MainMap {

    List<Pessoa> lista = new Pessoa().popularPessoas();

    Stream<Integer> steam = lista.stream()
            .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
            .map(Pessoa::getIdade);
}
