package com.modulo16.facade;

public class ApartamentoService implements IApartamentoService{
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isPartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);

        if (isCadastrado && !isCamposValidos) {
            return false;
        }
        return null;
    }

    private Boolean isPartamentoCadastrado(Apartamento apartamento) {
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        return true;
    }
}
