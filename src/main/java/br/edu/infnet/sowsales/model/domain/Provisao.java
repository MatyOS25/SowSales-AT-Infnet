package br.edu.infnet.sowsales.model.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.sowsales.model.exceptions.DataPrevNullException;
import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;
import br.edu.infnet.sowsales.model.service.interfaces.IModel;

public class Provisao extends Lancamento{

    private LocalDate dataPrev; 
    private Boolean saida;
    private String infoAdicional;
    private Historico hist;

    private Integer id;
    
    
    public Provisao(String name, float valor, String dataPrev, Boolean saida, Historico hist) throws FormatoDataException, NameEmptyException, DataPrevNullException {
    	super(name, valor);
    	if (dataPrev == null) {
        	throw new DataPrevNullException("Data inserida nao inserida");
        }
        try{
			this.dataPrev = LocalDate.parse(dataPrev,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
        this.saida = saida;
        this.hist = hist;
    }
    public Provisao(String name, float valor, String dataPrev, Boolean saida) throws FormatoDataException, NameEmptyException, DataPrevNullException {
        super(name, valor);
        if (dataPrev == null) {
        	throw new DataPrevNullException("Data inserida nao inserida");
        }
        try{
			this.dataPrev = LocalDate.parse(dataPrev,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
        this.saida = saida;
    }

    public Provisao(String name, float valor, LocalDate dataPrev, Boolean saida) throws FormatoDataException, NameEmptyException, DataPrevNullException {
        super(name, valor);
        if (dataPrev == null) {
        	throw new DataPrevNullException("Data inserida nao inserida");
        }
        try{
			this.dataPrev = dataPrev; 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
        this.saida = saida;
    }


    public Provisao(String name, float valor, String dataPrev, Historico hist)throws FormatoDataException, NameEmptyException, DataPrevNullException {
        super(name, valor);
        if (dataPrev == null) {
        	throw new DataPrevNullException("Data inserida nao inserida");
        }
        try{
			this.dataPrev = LocalDate.parse(dataPrev,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
        this.saida = true;
        this.hist = hist;
    }
    public Provisao(String name, float valor, String dataPrev)throws FormatoDataException, NameEmptyException, DataPrevNullException {
        super(name, valor);
        if (dataPrev == null) {
        	throw new DataPrevNullException("Data inserida nao inserida");
        }
        try{
			this.dataPrev = LocalDate.parse(dataPrev,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
        this.saida = true;
    }
    @Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(saida ? "saida" : "entrada");
		sb.append(";");
		sb.append(dataPrev.toString());
		sb.append(";");
		sb.append(infoAdicional);

		return sb.toString();
	}
    @Override
    public float calcularValorFiscal() {
        return saida == true ? -this.getValor() : this.getValor();
    }

    public String getData() {
		return dataPrev.toString();
	}

	public void setData(LocalDate dataPrev) {
		this.dataPrev = dataPrev;
	}
    public Boolean getSaida() {
        return saida;
    }
    public void setSaida(Boolean saida) {
        this.saida = saida;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }
    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }
    public Historico getHist() {
        return hist;
    }
    public void setHist(Historico hist) {
        this.hist = hist;
    }


    public void setId(Integer id){
	    this.id = id; 
	  }
	public Integer getId(){
		return id;
	}
}
