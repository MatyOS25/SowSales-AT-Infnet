package br.edu.infnet.sowsales.model.exceptions;

public class VariedadeEmptyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public VariedadeEmptyException(String mensagem){
		super(mensagem);
	}
}
