package com.modulo15.abstractFactory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade) ) {
            return new Corola(100, "meio", "prata");
        } else {
            return new Civic(90, "Cheio", "Preta");
        }
    }
}
