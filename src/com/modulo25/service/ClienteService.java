package com.modulo25.service;

import com.modulo25.dao.ClienteDAO;
import com.modulo25.dao.IClienteDAO;
import com.modulo25.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = new ClienteDAO();
    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return clienteDAO.buscarPorCpf(cpf);
    }

    @Override
    public void excluir(Long cpf) {

    }
}
