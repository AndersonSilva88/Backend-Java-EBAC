package com.modulo17.cadastro;

import com.modulo17.generics.Produto;

import java.util.Collection;

public class ProdutoDAO implements IProdutoDao{
    @Override
    public Boolean cadastrar(Produto produto) {
        return null;
    }

    @Override
    public void excluir(Long codigo) {

    }

    @Override
    public void alterar(Produto produto) {

    }

    @Override
    public Produto consultar(Long codigo) {
        return null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
