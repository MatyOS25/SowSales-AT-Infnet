package br.edu.infnet.sowsales.model.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;

public class Transacao {
	
	private LocalDate data;
	private String detalhes;	
	private boolean web; 

	private User user;
	private List<Lancamento> lancamentos;

	private Integer id;

	public Transacao(User user, List<Lancamento> lancamentos) throws FormatoDataException {
		this.user = user;
		this.lancamentos = lancamentos;
		this.web = false;
	}
	public Transacao(User user, String data,List<Lancamento> lancamentos,String detalhes) throws FormatoDataException {
		try{
			this.data = LocalDate.parse(data,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
		this.detalhes = detalhes;
		this.user = user;
		this.lancamentos = lancamentos;
		this.web = false;
	}

	public String obterLinha() {	

		return this.getData().toString()+";"+
			   this.getDetalhes()+";"+
			   this.getUser()+";"+
			   this.getLancamentos().size()+"\r\n";
	}

	@Override
	public String toString(){
		return  String.format("%s;%s;%s;%s", 
			detalhes, 
			web ? "web" : "loja",  
			data.toString(),
			this.lancamentos.size()
		);
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}

	public String getData() {
		return data.toString();
	}

	public void setData(String data) throws FormatoDataException {
		try{
			this.data = LocalDate.parse(data,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
	}
	
	public void setToday() {
		this.data = LocalDate.parse("2018-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
	}
	public User getUser() {
		return user;
	}
	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public void setId(Integer id){
	    this.id = id; 
	  }
	public Integer getId(){
		return id;
	}

}
