package br.edu.infnet.sowsales.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.sowsales.model.auxiliar.Constante;
import br.edu.infnet.sowsales.model.domain.Conta;
import br.edu.infnet.sowsales.model.domain.Lancamento;
import br.edu.infnet.sowsales.model.domain.Partida;
import br.edu.infnet.sowsales.model.domain.Provisao;
import br.edu.infnet.sowsales.model.domain.Reserva;
import br.edu.infnet.sowsales.model.domain.Transacao;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.exceptions.ContaEmptyException;
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
			Conta conta = new Conta("Empresa de Tecnologia", "Santander", true);
			List<Lancamento> lan1 = new ArrayList<Lancamento>();
			Partida part1;
			try {
				part1 = new Partida("recebimento salario", 1990, conta,false);
				lan1.add(part1);
			} catch (NameEmptyException | ContaEmptyException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Provisao prov1;
			try {
				prov1 = new Provisao("recebimento salario", 1990, "2022-12-25",false);
				lan1.add(prov1);
			} catch (FormatoDataException | NameEmptyException | DataPrevNullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Reserva reserv;
			try {
				reserv = new Reserva("13", Constante.VALOR_PADRAO, "2022-12-25","Reserva futura proveniente de dividendos");
				lan1.add(reserv);
			} catch (FormatoDataException | InfoAdicionalIncompletaException | NameEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			try{
				Transacao trans = new Transacao(user, "2022-02-20", lan1, "Transacoes do primeiro dia de ferias");
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
