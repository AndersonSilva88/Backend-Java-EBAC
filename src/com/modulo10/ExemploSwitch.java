package com.modulo10;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        String idade1 = getIdade(idade);
        System.out.println(idade1);

    }

    public static String getIdade(int idade) {
        String result;
        switch (idade) {
            case 0:

            case 5:
                result = "Você é um bebê";
                break;
            case 6:
            case 10:
                result = "Você é uma criança";
                break;
            case 11:
            case 18:
                result = "Você é adolescente";
                break;
            default:
                result = "Você é adulto";
                break;
        }

        return result;
    }
}
