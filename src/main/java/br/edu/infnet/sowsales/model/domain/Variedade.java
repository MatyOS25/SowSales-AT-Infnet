package br.edu.infnet.sowsales.model.domain;

public class Variedade {
    private String nome;
    private boolean ativo;
    
    private String obtentor;
    private Variedade contaMae;

    private Integer id;

    public Variedade(String nome, String obtentor, boolean ativo) {
        this.nome = nome;
        this.obtentor = obtentor;
        this.ativo = ativo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getobtentor() {
        return obtentor;
    }
    public void setobtentor(String obtentor) {
        this.obtentor = obtentor;
    }

    
    
    public Variedade getContaMae(){
        return contaMae;
    }
    public void setContaMae(Variedade contaMae){
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
