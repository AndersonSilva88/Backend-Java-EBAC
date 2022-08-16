package com.modulo22.app;

import com.modulo22.streams.Pessoa;

import java.util.List;

public class MainCount {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();

        System.out.println(count);
    }
}
