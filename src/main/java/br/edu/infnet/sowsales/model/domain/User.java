package br.edu.infnet.sowsales.model.domain;

import br.edu.infnet.sowsales.model.exceptions.UserIncompletoException;

public class User{
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private Integer id;

    public User(String email, String senha, String nome, String cpf) throws UserIncompletoException {
    	if(nome == null || nome == "" || email == null || email == "" || cpf == null || cpf == "" || senha == null || senha == "" ) {
    		throw new UserIncompletoException("Nome, Email ou CPF estao com valor null");
    	}
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
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

	public String getSenha() {
		return senha;
	}




  
}
