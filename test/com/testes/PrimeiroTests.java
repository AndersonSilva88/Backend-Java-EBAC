package com.testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTests {

    @Test
    public void primeiroTest() {
        String nome = "Anderson";
        Assert.assertEquals("Anderson", nome);
    }

    @Test
    public void testNotEquals() {
        String nome = "Anderson";
        Assert.assertNotEquals("Anderson1", nome);
    }

}
