package com.modulo14;

import com.modulo14.crud.dao.ClienteMapDAO;
import com.modulo14.crud.dao.IClienteDAO;
import com.modulo14.crud.domain.Cliente;

import javax.swing.*;

public class Main {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();
        //menu
        String opcao = JOptionPane.showInputDialog(null, "1 - Cadastro \n2 - Consultar\n" +
                "3 - Exclusao\n4 - Alterar\n5 - Sair", "TELA DE CADASTRO", JOptionPane.INFORMATION_MESSAGE);

        //validar entrada
        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }

            opcao = JOptionPane.showInputDialog(null, "ATENÇÃO OPÇÃO INVÁLIDA!!\n" +
                    "1 - Cadastro \n2 - Consultar\n3 - Exclusao\n4 - Alterar\n5 - Sair", "TELA DE CADASTRO", +
                    JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente\n" +
                        "separados por vírgula, conforme exemplo abaixo\n" +
                        "Nome, CPF, Telefone, Endereco, Numero, Cidade e Estado", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do Cliente ",
                        "Consultar Informações: ", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula, conforme exemplo: " +
                                "Nome, CPF, Telefone, Endereço, Número, Cidade e Estado", "Atualização," +
                                JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }


            opcao = JOptionPane.showInputDialog(null, "1 - Cadastro \n2 - Consultar\n" +
                    "3 - Exclusao\n4 - Alterar\n5 - Sair", "TELA DE CADASTRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso: ",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(),
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ",
                    "Tente outro", JOptionPane.INFORMATION_MESSAGE);
        }


    }


    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso! ", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já Cadastrado", "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isExclusao(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Finalizando Sistema: ", "Sair",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }


    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }

        return false;
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }


}
