package br.edu.infnet.sowsales.model.domain;

import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;
import br.edu.infnet.sowsales.model.service.interfaces.IModel;

public abstract class Lancamento implements IModel {
	private String name;
	private float valor;
	private String description = "Sem descricao";
	private Conta conta;

	private Integer id;


	public Lancamento(String name, float valor, String description,Conta conta) throws NameEmptyException {
		this(name, valor, description);
		this.conta = conta;
	}
	public Lancamento(String name, float valor, Conta conta) throws NameEmptyException {
		this(name, valor);
		this.conta = conta;
	}
	public Lancamento(String name, float valor, String description) throws NameEmptyException{
		this(name, valor);
		this.description = description;
	}

	public Lancamento(String name, float valor) throws NameEmptyException {
		if(name == null) {
			throw new NameEmptyException("Nome precisa ser preenchido");
		}
		this.name = name;
		this.valor = valor;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();	
		sb.append(name);
		sb.append(";");
		sb.append(description);
		sb.append(";");
		sb.append(valor);
		return sb.toString();
	}
	
	public abstract float calcularValorFiscal();

	public float getValor() {
		return valor;
	}
	public String getName() {
		return name;
	}
	public Conta getConta() {
		return conta;
	}
	public String getDescription() {
		return description;
	}


	public void setId(Integer id){
	    this.id = id; 
	  }
	public Integer getId(){
		return id;
	}
	
}
