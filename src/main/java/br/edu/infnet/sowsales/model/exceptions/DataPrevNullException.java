package br.edu.infnet.sowsales.model.exceptions;

public class DataPrevNullException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DataPrevNullException(String mensagem){
		super(mensagem);
	}
}
