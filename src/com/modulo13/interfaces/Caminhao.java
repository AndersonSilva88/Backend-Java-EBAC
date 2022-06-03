package com.modulo13.interfaces;

public class Caminhao implements ICarro{
    @Override
    public void andar() {
        System.out.println("Caminhao andando lentamente");
    }
}
