package com.modulo11.list;

import com.domain.Aluno;
import com.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {

    public static void main(String[] args) {

        exemploListaSimplesOrdenadaClasseExterna();
        exemploListaSimplesOrdenadaComparatorAluno();

    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("**** exemploListaSimplesOrdenadaClasseExterna ****");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("Anderson", "Linux basico", 10.0);
        Aluno b = new Aluno("André", "Java", 9.3);
        Aluno c = new Aluno("Julia", "inglês", 7.0);

        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println(lista);
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("**** exemploListaSimplesOrdenadaComparatorAlun ****");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("Julio", "JavaScript", 7.5);
        Aluno b = new Aluno("Cleberson", "Qualidade", 8.9);
        Aluno c = new Aluno("Fernando", "Mecanica", 7.8);

        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println("Lista sem ordenação " + lista);
        //Collections.sort(lista);
        System.out.println("Lista com ordenação " + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota " + lista);

        System.out.println("");

    }
}
