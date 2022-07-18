package com.modulo15.singleton;

import com.modulo15.singleton.SimgletonPropriedade;

public class Main {

    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton1 = Singleton.getInstance();
//        System.out.println(singleton);
//        System.out.println(singleton1);

//        SimgletonPropriedade singleton = SimgletonPropriedade.getInstance("teste");
//        SimgletonPropriedade singleton1 = SimgletonPropriedade.getInstance("Java");
//
//        System.out.println(singleton.getValue());
//        System.out.println(singleton1.getValue());

        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());

        t1.start();
        t2.start();

    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            SimgletonPropriedade singleton = SimgletonPropriedade.getInstance("teste");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SimgletonPropriedade singleton = SimgletonPropriedade.getInstance("Teste1");
            System.out.println(singleton.getValue());
        }
    }
}
