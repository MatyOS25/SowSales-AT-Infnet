package br.edu.infnet.sowsales.model.domain;

import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;
import br.edu.infnet.sowsales.model.service.interfaces.IModel;

public abstract class Produto implements IModel {
	private String name;
	private float valor;
	private String description = "Sem descricao";
	private Variedade variedade;
	private Embalagem embalagem;
	private String especie;
	private int quantidade;

	private Integer id;


	public Produto(String name, float valor, String description,Variedade variedade) throws NameEmptyException {
		this(name, valor, description);
		this.variedade = variedade;
	}
	public Produto(String name, float valor, String description,Variedade variedade, Embalagem embalagem) throws NameEmptyException {
		this(name, valor, description);
		this.variedade = variedade;
		this.embalagem = embalagem;
	}
	public Produto(String name, float valor, Variedade variedade) throws NameEmptyException {
		this(name, valor);
		this.variedade = variedade;
	}
	public Produto(String name, float valor, String description) throws NameEmptyException{
		this(name, valor);
		this.description = description;
	}

	public Produto(String name, float valor) throws NameEmptyException {
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
	public Variedade getVariedade() {
		return variedade;
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
	public void setEmbalagem(Embalagem emb){
		this.embalagem = emb;
	}
	public Embalagem getEmbalagem(){
		return embalagem;
	}
	public void setEspecie(String especie){
		this.especie = especie;
	}
	public String getEspecie(){
		return especie;
	}
	public void setQuantidade(int quant){
		this.quantidade = quant;
	}
	public int getQuantidade(){
		return quantidade;
	}
	
}
