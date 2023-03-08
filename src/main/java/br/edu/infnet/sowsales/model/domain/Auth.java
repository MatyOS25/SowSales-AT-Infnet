package br.edu.infnet.sowsales.model.domain;

import br.edu.infnet.sowsales.model.exceptions.UserIncompletoException;

public class Auth{
    private String email;
    private String senha;

    public Auth(String email, String senha){
        this.email = email;
        this.senha = senha;
    }

    @Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(email);
		
		return sb.toString();
	}

     public String getEmail() {
        return email;
    }
	public String getSenha() {
		return senha;
	}




  
}
