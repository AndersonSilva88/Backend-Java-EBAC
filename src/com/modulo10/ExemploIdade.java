package com.modulo10;

import java.util.Scanner;

public class ExemploIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        String idade1 = getIdade(idade);
        System.out.println(idade1);

        sc.close();
    }

    public static String getIdade(int idade) {
        if (idade >= 0 && idade <= 5){
            return "Você é um bebê";
        } else if (idade >= 6 && idade <= 10) {
            return "Você é uma criança";
        } else if (idade >= 11 && idade <= 18) {
            return "Você é adolescente";
        } else {
            return "Você é adulto";
        }

    }
}
