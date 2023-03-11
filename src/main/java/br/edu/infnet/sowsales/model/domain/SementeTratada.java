package br.edu.infnet.sowsales.model.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.InfoAdicionalIncompletaException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;

public class SementeTratada extends Produto {


    private LocalDate dataPrev; 
    private Historico hist;
    

    private String infoAdicional;

    private String produtoTSI;
    private float custoTSI;
    private float custoProducao;

    private Variedade variedade;

    private Integer id;


    public SementeTratada(String name, float valor, String dataPrev) throws FormatoDataException, InfoAdicionalIncompletaException, NameEmptyException{
    	super(name, valor);
        try{
			this.dataPrev = LocalDate.parse(dataPrev,DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
		}
		catch(Exception e){
			throw new FormatoDataException("A data precisa estar no formato yyyy-MM-dd"); 
		}
        
        //TODO Auto-generated constructor stub
    }
    public SementeTratada(String name, float valor, LocalDate dataPrev, String infoAdicional) throws FormatoDataException, InfoAdicionalIncompletaException, NameEmptyException{
    	super(name, valor);
        this.dataPrev = dataPrev;
        this.infoAdicional = infoAdicional;
        
        //TODO Auto-generated constructor stub
    }

    public SementeTratada(String name, float valor, String dataPrev, String infoAdicional) throws FormatoDataException, InfoAdicionalIncompletaException, NameEmptyException{
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
    public void setProdutoTSI(String tsi){
        this.produtoTSI = tsi;
    }
    public String getProdutoTSI(){
        return produtoTSI;
    }
    public void setCustoTSI(float custoTSI){
        this.custoTSI = custoTSI;
    }
    public float getCustoTSI(){
        return custoTSI;
    }
    public void setCustoProducao(float custoProducao){
        this.custoProducao = custoProducao;
    }
    public float getCustoProducao(){
        return custoProducao;
    }
    public void setVariedade(Variedade variedade){
        this.variedade = variedade;
    }
    public Variedade getVariedade(){
        return variedade;
    }

}
