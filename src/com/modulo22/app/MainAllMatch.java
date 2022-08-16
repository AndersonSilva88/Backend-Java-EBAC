package com.modulo22.app;

import com.modulo22.streams.Pessoa;

import java.util.List;

public class MainAllMatch {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        System.out.println(result);

        //metodo convencional
        Boolean re = true;
        for (Pessoa p: lista) {
            if (!p.getNacionalidade().equals("Brasil")) {
                re = false;
                break;
            }
        }
    }
}
