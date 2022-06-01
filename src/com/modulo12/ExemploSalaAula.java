package com.modulo12;

import com.domain.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploSalaAula {

    public static void main(String[] args) {
        Map<Integer, List<Aluno>> listaSala = new HashMap<>();

        List<Aluno> alunoSala1 = criarTurma("Sala1", 10);
        listaSala.put(1, alunoSala1);

        List<Aluno> alunosSala2 = criarTurma("Sala2", 30);
        listaSala.put(2, alunosSala2);

        imprimirAlunosSala(listaSala.get(1));
    }

    private static List<Aluno> criarTurma(String sala, int count) {
        List<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i<count; i++) {
            Aluno aluno = new Aluno("nome aluno " + i, "Curso" + i, i, sala );
            alunos.add(aluno);
        }
        return alunos;
    }

    private static void imprimirAlunosSala(List<Aluno> alunos) {
        System.out.println("For java 8 API stream");
        alunos.forEach(aluno-> System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala()));
        System.out.println("");

        System.out.println("for Java");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
        System.out.println("");

        System.out.println("for Java com contador");
        for (int i=0; i< alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Nome: " + aluno.getNome() + " Sala:" + aluno.getSala());
        }
    }
}
