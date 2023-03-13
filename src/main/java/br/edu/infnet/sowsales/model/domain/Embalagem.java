package br.edu.infnet.sowsales.model.domain;

public abstract class Embalagem {
    private float valor;
    private String name;
    private Integer id;

    public Embalagem(String name, float valor) {
        this.name = name;
        this.valor = valor;
    }
    
    public float getValor() {
        return valor;
    }

    public void setId(Integer id){
	    this.id = id; 
	  }
	public Integer getId(){
		return id;
	}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
