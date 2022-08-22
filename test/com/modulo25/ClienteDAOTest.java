package com.modulo25;

import com.modulo25.dao.ClienteDAO;
import com.modulo25.dao.ClienteDaoMock;
import com.modulo25.dao.IClienteDAO;
import com.modulo25.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

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

        clienteDao.salvar(cliente);
    }

    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);

    }

    @Test
    public void salvarCliente() {
        clienteDao.salvar(cliente);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

}
