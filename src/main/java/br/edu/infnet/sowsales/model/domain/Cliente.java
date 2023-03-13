package br.edu.infnet.sowsales.model.domain;

import br.edu.infnet.sowsales.model.exceptions.UserIncompletoException;

public class Cliente{
    private String nome;
    private String email;
    private String cpf;
    private String cnpj;
    private Integer id;
    private String endereco;

    

    public Cliente(String email,  String nome, String ident) throws UserIncompletoException {
    	if(nome == null || nome == "" || email == null || email == "" || ident == null || ident == "" ) {
    		throw new UserIncompletoException("Nome, Email ou CPF estao com valor null");
    	}
        this.email = email;
        this.nome = nome;
        if(ident.length() == 14){
            this.cnpj = ident;
        } 
        else{
            this.cpf = cnpj;
        }
    }

    @Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
        if(this.cnpj != null){
		    sb.append(cnpj);
        }
        else{
		    sb.append(cpf);
        }
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	  public void setId(Integer id){
	    this.id = id; 
	  }
	  public Integer getId(){
      return id;
	  }

     public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


  
}
