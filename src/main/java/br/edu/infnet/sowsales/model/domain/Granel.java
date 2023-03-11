package br.edu.infnet.sowsales.model.domain;

import br.edu.infnet.sowsales.model.exceptions.VariedadeEmptyException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;

public class Granel extends Produto {


    private boolean transacao;
    private float umidade;
    private boolean exportacao;
    private boolean graoArdido;
    
    private Integer id;
    

    
    public Granel(String name, float valor, String description, Variedade variedade, boolean exportacao ) throws NameEmptyException, VariedadeEmptyException {
        super(name, valor,description,variedade);
        if(variedade == null) {
        	throw new VariedadeEmptyException("variedade necessaria para cadastrar partida");
        }
        this.exportacao = exportacao;
        //TODO Auto-generated constructor stub
    }
    public Granel(String name, float valor, Variedade variedade, boolean transacao) throws NameEmptyException, VariedadeEmptyException {
        super(name, valor, variedade);
        if(variedade == null) {
        	throw new VariedadeEmptyException("variedade necessaria para cadastrar partida");
        }
        this.transacao = transacao;
    }
    @Override
    public float calcularValorFiscal() {
        float val = this.getValor();
        return transacao == true ?  val * -1: val;
    }
    public void setUmidade(float umidade){
	    this.umidade = umidade; 
	  }
	public float getUmidade(){
		return umidade;
	}
    public void setExportacao(Boolean exp){
	    this.exportacao = exp; 
	  }
	public Boolean getExportacao(){
		return exportacao;
	}
    public void setGraoArdido(Boolean ardido){
	    this.graoArdido = ardido;
	  }
	public Boolean getGraoArdido(){
		return graoArdido;
	}

    public void setId(Integer id){
	    this.id = id; 
	  }
	public Integer getId(){
		return id;
	}
}
