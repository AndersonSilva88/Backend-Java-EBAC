package com.modulo18.exceptions;

public class ClienteService {

    public static void consultarCliente(String codigo) throws ClienteException {

        boolean isCadastrado = false;

        if (!isCadastrado) {
            throw new ClienteException("Cliente não encontrado");
        }
    }
}
