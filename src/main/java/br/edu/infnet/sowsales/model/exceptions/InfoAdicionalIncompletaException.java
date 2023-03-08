package br.edu.infnet.sowsales.model.exceptions;

public class InfoAdicionalIncompletaException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public InfoAdicionalIncompletaException(String mensagem){
		super(mensagem);
	}
}
