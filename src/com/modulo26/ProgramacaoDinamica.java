package com.modulo26;

public class ProgramacaoDinamica {

    private static final int MAX_ELEMENTOS = 100;
    private static final long[] elementoFibo = new long[MAX_ELEMENTOS];

    public static long encontrarelementoPD(int n) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) {
            elementoFibo[i] = -1;
        }

        return encontrarElemento(n);
    }

    private static long encontrarElemento(int n) {
        if (elementoFibo[n] == -1) {
            if (n <= 1) {
                elementoFibo[n] = n;
            } else {
                elementoFibo[n] = encontrarElemento(n -1) + encontrarElemento(n - 2);
            }

        }
        return elementoFibo[n];
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Elemento " + n + ": " + encontrarelementoPD(n));
    }
}
