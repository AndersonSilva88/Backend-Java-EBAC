package com.modulo17.generics;

public class ExemploGenericEntry {

    public static void main(String[] args) {
        GenericEntry<String, Long> entry = new GenericEntry<String, Long>("teste", 10L);
        System.out.println(entry.getData());

        GenericEntry<Long, Integer> entryLong = new GenericEntry<Long, Integer>(10L, 11);
        System.out.println(entryLong.getData());
    }
}
