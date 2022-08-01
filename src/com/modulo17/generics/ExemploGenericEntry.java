package com.modulo17.generics;

public class ExemploGenericEntry {

    public static void main(String[] args) {
        GenericEntry<String> entry = new GenericEntry<>("teste");
        System.out.println(entry.getData());

        GenericEntry<Long> entryLong = new GenericEntry<>(10L);
        System.out.println(entryLong.getData());
    }
}
