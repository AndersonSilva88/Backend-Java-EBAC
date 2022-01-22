package com.modulo10;

import java.util.Scanner;

public class ExemploPPT1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int result = sc.nextInt();

        if (result > 1) {
            System.out.println("Resultado maior que 1");
        } else {
            System.out.println("Resultado menor que 1");
        }

        sc.close();
    }
}
