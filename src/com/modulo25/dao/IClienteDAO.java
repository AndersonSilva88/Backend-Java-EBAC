package com.modulo25.dao;

import com.modulo25.domain.Cliente;

public interface IClienteDAO {

    public void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);
}
