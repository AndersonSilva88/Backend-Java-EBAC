package com.modulo10;

public class ExemploBreak {

    public static void main(String[] args) {
        for (int count = 1; count <= 1000; count++) {
            System.out.println("Esta é a repetição nr: " + count);

            if (count == 10)
                break;
        }
    }
}
