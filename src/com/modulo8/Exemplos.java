package com.modulo8;

public class Exemplos {

    private int codigo;

    private long codigoMaior;

    private double valorDecimal1;

    private String texto;

    private boolean status;


    private float valorDecimal;

    private short shor;

    private byte bi;

    public Exemplos(){

    }


    public String retornaTexto() {
        return "abcde";
    }
    public int retornaInteiro() {
        this.codigo = 20;
        int val = 10;
        return val;
    }

    public long retornaLong(long num) {
        return num;
    }

}
