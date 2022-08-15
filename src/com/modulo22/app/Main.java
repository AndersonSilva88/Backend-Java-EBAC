package com.modulo22.app;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> stream = List.of("Anderson", "Silva").stream();

        Set.of("Anderson","Silva").stream();

        Map<String, String> map = Map.of("Anderson", "Silva");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "asds");

    }
}
