package com.testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTests {

    @Test
    public void test2() {
        String nome = "Anderson";
        Assert.assertEquals("Anderson", nome);
    }
}
