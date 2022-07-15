package com.modulo15;

public class SimgletonPropriedade {

    private static SimgletonPropriedade singleton;
    private String value;

    private SimgletonPropriedade(String value) {
        this.value = value;
    }

    public static SimgletonPropriedade getInstance(String value) {

        if (singleton == null) {
            singleton = new SimgletonPropriedade(value);
        }

        return singleton;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
