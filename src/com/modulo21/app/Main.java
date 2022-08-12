package com.modulo21.app;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Runnable hello_world = () -> System.out.println("Hello world!");

        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("value");

        Supplier<Integer> integerCallable = () -> 42;
        Supplier<Double> doubleCallable = () -> {
            return 3.1415;
        };
    }
}
