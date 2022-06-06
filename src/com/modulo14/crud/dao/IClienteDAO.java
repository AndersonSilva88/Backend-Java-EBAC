package com.modulo14.crud.dao;

import com.modulo14.crud.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cof);

    public Collection<Cliente> buscarTodos();

}
