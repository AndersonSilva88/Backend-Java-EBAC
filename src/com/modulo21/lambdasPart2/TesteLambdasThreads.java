package com.modulo21.lambdasPart2;

public class TesteLambdasThreads {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando comum");
            }
        };
        new Thread(r).start();

        Runnable rLambda = () -> System.out.println("Executando rLambda");
        new Thread(rLambda).start();

        new Thread(() -> System.out.println("Executando Lambda 1")).start();
    }
}
