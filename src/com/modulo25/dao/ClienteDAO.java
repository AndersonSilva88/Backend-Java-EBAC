package com.modulo25.dao;

import com.modulo25.dao.generics.GenericDAO;
import com.modulo25.domain.Cliente;

import java.io.Serializable;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void excluir(String cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return null;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public void excluir(Serializable valor) {

    }
}
