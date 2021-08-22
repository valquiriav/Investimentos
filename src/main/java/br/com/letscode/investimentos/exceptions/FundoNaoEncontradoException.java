package br.com.letscode.investimentos.exceptions;

public class FundoNaoEncontradoException extends RuntimeException{
    private static final String MENSAGEM = "Nenhum fundo com esta identificação foi encontrado.";

    public FundoNaoEncontradoException() {
        this(MENSAGEM);
    }

    public FundoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
