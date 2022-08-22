package com.modulo25;

import com.modulo25.dao.ClienteDaoMock;
import com.modulo25.dao.IClienteDAO;
import com.modulo25.domain.Cliente;
import com.modulo25.service.ClienteService;
import com.modulo25.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    Cliente cliente = new Cliente();
    private IClienteService clienteService;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(123456789l);
        cliente.setNome("Anderson");
        cliente.setCidade("Curitiba");
        cliente.setEndereco("Rua araras");
        cliente.setEstado("PR");
        cliente.setNumero(10);
        cliente.setTelefone(7894561236l);

        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        clienteService.salvar(cliente);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Anderson");
        clienteService.alterar(cliente);
        Assert.assertEquals("Anderson", cliente.getNome());
    }
}
