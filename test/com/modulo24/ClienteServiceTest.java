package com.modulo24;

import com.modulo24.dao.ClienteDAO;
import com.modulo24.dao.ClienteDAOMock;
import com.modulo24.dao.IClienteDAO;
import com.modulo24.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDAOMock mockDAO = new ClienteDAOMock();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperandoErroNoSalvar() {
        IClienteDAO mockDAO = new ClienteDAO();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

}
