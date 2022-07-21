package com.modulo16.templateMethod;

public class Bombeiro extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como bombeiro");
    }
}
