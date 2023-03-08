package br.edu.infnet.sowsales.model.domain;

public class Conta {
    private String conta;
    private boolean ativo;
    
    private String banco;
    private Conta contaMae;

    private Integer id;

    public Conta(String conta, String banco, boolean ativo) {
        this.conta = conta;
        this.banco = banco;
        this.ativo = ativo;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }

    
    
    public Conta getContaMae(){
        return contaMae;
    }
    public void setContaMae(Conta contaMae){
        this.contaMae = contaMae;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }   

    public void setId(Integer id){
	    this.id = id; 
	  }
	public Integer getId(){
		return id;
	}
}
