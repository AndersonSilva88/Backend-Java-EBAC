package com.modulo18.exceptions;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null,"Digite código do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(opcao);
        } catch (ClienteException e) {
            System.out.println(e.getMessage());
        }



    }
}
