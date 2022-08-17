package com.modulo23;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();

        cli.adicionarNome("Anderson");

        Assert.assertEquals("Anderson", cli.getNome());
    }
}
