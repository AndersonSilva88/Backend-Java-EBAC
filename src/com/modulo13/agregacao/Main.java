package com.modulo13.agregacao;

public class Main {

    public static void main(String[] args) {
        Produto produtoCopo = criarProduto(1L, 10.0, "Copo");
        Produto produtoCelular = criarProduto(1L, 1000.0, "Celular");

        Vendedor vendedor = criarVendedor("Anderson", 0.02);

        Comprador comprador = criarComprador("Anderson s", 100.0);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoCopo);
        venda.add(produtoCelular);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);

    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);

        return produto;
    }
}
