package br.edu.infnet.sowsales.model.tests;

import br.edu.infnet.sowsales.model.auxiliar.Constante;
import br.edu.infnet.sowsales.model.domain.Variedade;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.exceptions.UserIncompletoException;

public class UserTeste{
	public static void main(String[] args) {
		User user;
		try {
			user = new User(Constante.NOME_PADRAO,"joao@gomes.com","123.456.789-01","123123");
			System.out.println(user);
		} catch (UserIncompletoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
