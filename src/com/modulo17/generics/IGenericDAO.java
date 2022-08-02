package com.modulo17.generics;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente > {

    public Boolean cadastrar(T entity);

    public void excluir(Long valor);

    public void alterar(T  entity);

    public Produto consultar(Long valor);

    public Collection<T> buscarTodos();
}
