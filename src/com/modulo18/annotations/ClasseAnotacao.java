package com.modulo18.annotations;

@PrimeiraAnotacao(value = "Anderson", bairros = "Teste", numeroCasa = 10)
public class ClasseAnotacao {

    @PrimeiraAnotacao(value = "Silva", bairros = {"Teste0", "Teste1", "Teste2"}, numeroCasa = 20, valores = 100)
    private String nome;

    @PrimeiraAnotacao(value = "Anderson", bairros = "Teste", numeroCasa = 10)
    public ClasseAnotacao() {

    }
}
