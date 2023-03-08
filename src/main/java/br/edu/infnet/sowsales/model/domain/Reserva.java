package br.edu.infnet.sowsales.model.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.InfoAdicionalIncompletaException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;

public class Reserva extends Lancamento {

    private Investimento invest;
    

    private LocalDate dataPrev; 
    private Historico hist;
    

    private String infoAdicional;

    private Integer id;


    public Reserva(String name, float valor, String dataPrev) throws FormatoDataException, InfoAdicionalIncompletaException, NameEmptyException{
    	super(name, valor);
        try{
			this.dataPrev = LocalDate.parse(dataPrev,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
        
        //TODO Auto-generated constructor stub
    }
    public Reserva(String name, float valor, LocalDate dataPrev, String infoAdicional) throws FormatoDataException, InfoAdicionalIncompletaException, NameEmptyException{
    	super(name, valor);
        this.dataPrev = dataPrev;
        this.infoAdicional = infoAdicional;
        
        //TODO Auto-generated constructor stub
    }

    public Reserva(String name, float valor, String dataPrev, String infoAdicional) throws FormatoDataException, InfoAdicionalIncompletaException, NameEmptyException{
    	super(name, valor);
        if(infoAdicional == null){
            throw new InfoAdicionalIncompletaException("Sem informacoes adicionais");
        }
        try{
			this.dataPrev = LocalDate.parse(dataPrev,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
        this.infoAdicional = infoAdicional;
        
        //TODO Auto-generated constructor stub
    }

    @Override
    public float calcularValorFiscal() {
        return this.getValor();
    }
    @Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(dataPrev.toString());
		sb.append(";");
		sb.append(infoAdicional);

		return sb.toString();
	}
    public String getData() {
		return dataPrev.toString();
	}

	public void setData(LocalDate data) {
		this.dataPrev = data;
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
    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public void setId(Integer id){
	    this.id = id; 
	  }
	public Integer getId(){
		return id;
	}



}
