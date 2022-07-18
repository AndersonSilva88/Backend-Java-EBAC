package com.modulo15.builder;

public class Main {

    public static void main(String[] args) {
        //Gerente gerente = new Gerente(new CheeseBurgerBuilder());
        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger buger = gerente.buildBurger();
        buger.print();

    }


}
