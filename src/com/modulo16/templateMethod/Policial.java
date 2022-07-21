package com.modulo16.templateMethod;

public class Policial extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Policial");
    }
}
