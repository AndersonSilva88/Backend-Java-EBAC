package com.modulo10;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta = "";
        do {
            System.out.println("Digite num número para gerar a tabuada: ");
            int num = sc.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Deseja gerar novamente a tabuada de algum número? ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("Sim"));
    }
}
