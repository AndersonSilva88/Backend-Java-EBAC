package com.modulo13.abstratas;

public class Horista extends Empregado{

    private Double precoHora;
    private Double totalhoraTrabalhada;

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getTotalhoraTrabalhada() {
        return totalhoraTrabalhada;
    }

    public void setTotalhoraTrabalhada(Double totalhoraTrabalhada) {
        this.totalhoraTrabalhada = totalhoraTrabalhada;
    }

    @Override
    public Double vencimento() {
        return precoHora*totalhoraTrabalhada;
    }
}
