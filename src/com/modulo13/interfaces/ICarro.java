package com.modulo13.interfaces;

public interface ICarro {

    default void parar() {
        System.out.println("Carro está parando");
    }

    public void andar();



}
