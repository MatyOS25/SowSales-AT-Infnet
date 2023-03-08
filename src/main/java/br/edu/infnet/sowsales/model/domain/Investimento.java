package br.edu.infnet.sowsales.model.domain;

public abstract class Investimento {
    private float valor;
    private String setor;
    private Integer id;

    public Investimento(String setor, float valor) {
        this.setor = setor;
        this.valor = valor;
    }

    public String getSetor() {
        return setor;
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
}
