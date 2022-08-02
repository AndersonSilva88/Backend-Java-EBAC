package com.modulo17.cadastro;

import com.modulo17.generics.Cliente;
import com.modulo17.generics.Produto;

import java.util.Collection;

public interface IProdutoDao {

    public Boolean cadastrar(Produto produto);

    public void excluir(Long codigo);

    public void alterar(Produto produto);

    public Produto consultar(Long codigo);

    public Collection<Produto> buscarTodos();
}
