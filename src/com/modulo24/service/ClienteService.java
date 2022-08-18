package com.modulo24.service;

import com.modulo24.dao.ClienteDAO;
import com.modulo24.dao.IClienteDAO;

public class ClienteService {

    private IClienteDAO iClienteDAO;

    public ClienteService(IClienteDAO iClienteDAO) {
        this.iClienteDAO = iClienteDAO;
    }

    public String salvar() {
        iClienteDAO.salvar();
        return "Sucesso";
    }
}
