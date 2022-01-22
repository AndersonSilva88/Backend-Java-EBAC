package com.modulo10;

import java.util.Scanner;

public class ExemploScanner1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("\nDigite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println(nome + " tem " + altura + " de altura.");

        sc.close();
    }
}
