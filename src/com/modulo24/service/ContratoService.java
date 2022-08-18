package com.modulo24.service;

public class ContratoService implements IContratoService{
    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override
    public String exclui() {
        return "Excluido";
    }

    @Override
    public String alterar() {
        return "Alterado";
    }

    @Override
    public String buscar() {
        return "Selecionar";
    }
}
