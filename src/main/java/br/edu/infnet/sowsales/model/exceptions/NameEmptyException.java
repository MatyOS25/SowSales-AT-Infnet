package br.edu.infnet.sowsales.model.exceptions;

public class NameEmptyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NameEmptyException(String mensagem){
		super(mensagem);
	}
}
