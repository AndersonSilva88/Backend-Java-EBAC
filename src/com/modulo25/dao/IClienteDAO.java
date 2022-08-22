package com.modulo25.dao;

import com.modulo25.dao.generics.IGenericDAO;
import com.modulo25.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente> {

    public void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
