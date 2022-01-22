package com.modulo10;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Você tem " +idade+ " anos.");

        sc.close();
    }
}
