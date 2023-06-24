package com.modulo26;

public class Fibonacci {
    public static int encontrarElemento(int n) {
        if (n <= 1) {
            return n;
        }

        return encontrarElemento(n - 1) + encontrarElemento(n - 2);
    }

    public static int Fatorial(int num) {
        if (num != 1) {
            num *= Fatorial(num -1);
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 100;

        System.out.println("Elemento " + n +": " + encontrarElemento(n));
        System.out.println("Fatorial " + Fatorial(n));
    }
}
