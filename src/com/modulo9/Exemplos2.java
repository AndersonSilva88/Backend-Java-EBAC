package com.modulo9;

public class Exemplos2 {

    public static void main(String[] args) {
        //Boxing
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;

        Long cpf = Long.valueOf(1234);
        Long cpf1 = 123456L;

        //unboxing
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');

        int idade2 = Integer.valueOf(12);

        long cpf3 = Long.valueOf(123456);
    }
}
