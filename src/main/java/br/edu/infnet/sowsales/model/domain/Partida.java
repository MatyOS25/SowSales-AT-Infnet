package br.edu.infnet.sowsales.model.domain;

import br.edu.infnet.sowsales.model.exceptions.ContaEmptyException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;

public class Partida extends Lancamento {

    private float debito;

    private float credito;
    private boolean transacao;
    private Historico hist;
    private Investimento invest;

    private Integer id;
    

    
    public Partida(String name, float valor, String description, Conta conta, boolean transacao ) throws NameEmptyException, ContaEmptyException {
        super(name, valor,description,conta);
        if(conta == null) {
        	throw new ContaEmptyException("Conta necessaria para cadastrar partida");
        }
        if(transacao == true){
            credito = valor;
        }
        else{
            debito = valor;
        }
        this.transacao = transacao;
        //TODO Auto-generated constructor stub
    }
    public Partida(String name, float valor, Conta conta, boolean transacao) throws NameEmptyException, ContaEmptyException {
        super(name, valor, conta);
        if(conta == null) {
        	throw new ContaEmptyException("Conta necessaria para cadastrar partida");
        }
        if(transacao == true){
            credito = valor;
        }
        else{
            debito = valor;
        }
        this.transacao = transacao;
    }
    @Override
    public float calcularValorFiscal() {
        float val = this.getValor();
        return transacao == true ?  val * -1: val;
    }
    public float getCredito() {
        return credito;
    }
    public void setCredito(float credito) {
        this.credito = credito;
    }


    public float getDebito() {
        return debito;
    }
    public void setDebito(float debito) {
        this.debito = debito;
    }
    public Historico getHist() {
        return hist;
    }
    public void setHist(Historico hist) {
        this.hist = hist;
    }
    public Investimento getInvest() {
        return invest;
    }
    public void setInvest(Investimento invest) {
        this.invest = invest;
    }

    public void setId(Integer id){
	    this.id = id; 
	  }
	public Integer getId(){
		return id;
	}
}
