package com.modulo14.crud.dao;

import com.modulo14.crud.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }


    @Override
    public Boolean cadastrar(Cliente cliente) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente consultar(Long cof) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
