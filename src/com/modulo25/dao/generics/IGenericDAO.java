package com.modulo25.dao.generics;

import com.modulo25.domain.Persistente;
import com.modulo25.exception.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    abstract void excluir(Serializable valor);

    void alterar(T entity) throws TipoChaveNaoEncontradaException;

    T consultar(Serializable valor);

    Collection<T> buscarTodos();
}
