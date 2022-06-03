package com.modulo13;

import com.modulo13.interfaces.*;

public class ClasseTeste {

    public static void main(String[] args) {

        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Mundo ");
        caneta.escreverComumAtodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Anderson");
        giz.escreverComumAtodas();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Java");
        lapis.escreverComumAtodas();
        System.out.println(lapis.getCor());

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();

    }
}
