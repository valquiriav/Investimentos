package br.com.letscode.investimentos.exceptions;

public class ClienteNaoEncontradoException extends RuntimeException{
    private static final String MENSAGEM = "Nenhum cliente com esta identificação foi encontrado.";

    public ClienteNaoEncontradoException() {
        this(MENSAGEM);
    }

    public ClienteNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
