package br.edu.infnet.sowsales.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.sowsales.model.auxiliar.Constante;
import br.edu.infnet.sowsales.model.domain.Variedade;
import br.edu.infnet.sowsales.model.domain.Produto;
import br.edu.infnet.sowsales.model.domain.Granel;
import br.edu.infnet.sowsales.model.domain.Semente;
import br.edu.infnet.sowsales.model.domain.SementeTratada;
import br.edu.infnet.sowsales.model.domain.Pedido;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.exceptions.VariedadeEmptyException;
import br.edu.infnet.sowsales.model.exceptions.DataPrevNullException;
import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.InfoAdicionalIncompletaException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;
import br.edu.infnet.sowsales.model.exceptions.UserIncompletoException;

public class TransacaoTeste {
	public static void main(String[] args) {
		User user;
		try {
			user = new User("Joao", "joao@gomes.com", "123.456.789-01", "123123");
			Variedade conta = new Variedade("Empresa de Tecnologia", "Santander", true);
			List<Produto> lan1 = new ArrayList<Produto>();
			Granel part1;
			try {
				part1 = new Granel("recebimento salario", 1990, conta,false);
				lan1.add(part1);
			} catch (NameEmptyException | VariedadeEmptyException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Semente prov1;
			try {
				prov1 = new Semente("recebimento salario", 1990, "2022-12-25",false);
				lan1.add(prov1);
			} catch (FormatoDataException | NameEmptyException | DataPrevNullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SementeTratada reserv;
			try {
				reserv = new SementeTratada("13", Constante.VALOR_PADRAO, "2022-12-25","Reserva futura proveniente de dividendos");
				lan1.add(reserv);
			} catch (FormatoDataException | InfoAdicionalIncompletaException | NameEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			try{
				Pedido trans = new Pedido(user, "2022-02-20", lan1, "Transacoes do primeiro dia de ferias");
				System.out.println(trans);
			}
			catch(FormatoDataException e){
				System.out.println("Erro:"+ e.getMessage());
			}
		} catch (UserIncompletoException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}
