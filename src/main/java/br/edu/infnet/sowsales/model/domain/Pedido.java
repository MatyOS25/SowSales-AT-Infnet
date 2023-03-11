package br.edu.infnet.sowsales.model.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.service.interfaces.IModel;

public class Pedido  implements IModel{
	
	private LocalDate data;
	private String detalhes;	
	private boolean web; 

	private User user;
	private Cliente cliente;
	private List<Produto> itens_pedido;

	private String safra;

	private Integer id;

	public Pedido(Cliente cliente, List<Produto> itens_pedido) throws FormatoDataException {
		this.cliente = cliente;
		this.itens_pedido = itens_pedido;
		this.web = false;
	}
	public Pedido(Cliente cliente, String data,List<Produto> itens_pedido,String detalhes) throws FormatoDataException {
		try{
			this.data = LocalDate.parse(data,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
		this.detalhes = detalhes;
		this.cliente = cliente;
		this.itens_pedido = itens_pedido;
		this.web = false;
	}

	public String obterLinha() {	

		return this.getData().toString()+";"+
			   this.getDetalhes()+";"+
			   this.getUser()+";"+
			   this.getitens_pedido().size()+"\r\n";
	}

	@Override
	public String toString(){
		return  String.format("%s;%s;%s;%s", 
			detalhes, 
			web ? "web" : "loja",  
			data.toString(),
			this.itens_pedido.size()
		);
	}

	public List<Produto> getitens_pedido() {
		return itens_pedido;
	}

	public void setitens_pedido(List<Produto> itens_pedido) {
		this.itens_pedido = itens_pedido;
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
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	public Cliente getCliente(){
		return cliente;
	}
	public void setSafra(String safra){
		this.safra = safra;
	}
	public String getSafra(){
		return safra;
	}

}
