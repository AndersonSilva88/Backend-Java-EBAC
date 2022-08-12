package com.modulo21.anonimas;

public class Main {

    public static void main(String[] args) {
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonima.consumer("Teste anônima");

        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer(10);

        receberInterface((Object value) -> System.out.println(value));
    }

    private static void receberInterface(MyEventConsumer anonimaLambda) {
        anonimaLambda.consumer("Olá");
    }
}
