package br.com.codenation.desafio.exceptions;

public class JogadorNaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public JogadorNaoEncontradoException(String message) {
		super(message);
	}

	public JogadorNaoEncontradoException() {
		// TODO Auto-generated constructor stub
	}

}
