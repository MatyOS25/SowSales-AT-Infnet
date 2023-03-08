package br.edu.infnet.sowsales.model.exceptions;

public class ContaEmptyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ContaEmptyException(String mensagem){
		super(mensagem);
	}
}
