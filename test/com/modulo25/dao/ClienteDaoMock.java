package com.modulo25.dao;

import com.modulo25.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO{
    @Override
    public void salvar(Cliente cliente) {
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
