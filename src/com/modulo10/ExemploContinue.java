package com.modulo10;

public class ExemploContinue {

    public static void main(String[] args) {
        for (int count = 1; count <= 100; count++) {
            if (count%5 != 0) {
                continue;
            }

            System.out.println("Contador: " + count);
        }
    }
}
