package com.modulo24;

import com.modulo24.service.ContratoService;
import com.modulo24.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoService service = new ContratoService();
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoService service = new ContratoService();
        String retorno = service.exclui();
        Assert.assertEquals("Excluido", retorno);
    }

    @Test
    public void alterarTest() {
        IContratoService service = new ContratoService();
        String retorno = service.alterar();
        Assert.assertEquals("Alterado", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoService service = new ContratoService();
        String retorno = service.buscar();
        Assert.assertEquals("Selecionar", retorno);
    }
}
