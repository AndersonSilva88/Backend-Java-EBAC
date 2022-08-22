package com.modulo25.service;

import com.modulo25.domain.Cliente;

public interface IClienteService {

    public void salvar(Cliente cliente);

    public Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
