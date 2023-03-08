package br.edu.infnet.sowsales.model.tests;

import br.edu.infnet.sowsales.model.auxiliar.Constante;
import br.edu.infnet.sowsales.model.domain.Conta;
import br.edu.infnet.sowsales.model.domain.Provisao;
import br.edu.infnet.sowsales.model.domain.Reserva;
import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.InfoAdicionalIncompletaException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;

public class ReservaTeste {
	public static void main(String[] args) {
		
		Reserva reserv;
		try {
			reserv = new Reserva("13", Constante.VALOR_PADRAO, "2022-12-25","Reserva futura proveniente de dividendos");
			System.out.println(reserv);
			System.out.println("Valor Fiscal:"+ reserv.calcularValorFiscal());
		} catch (FormatoDataException | InfoAdicionalIncompletaException | NameEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Reserva reserv1;
		try {
			reserv1 = new Reserva("proventos", 1990, "2022-12-30","Reserva futura ");
			System.out.println(reserv1);
			System.out.println("Valor Fiscal:"+ reserv1.calcularValorFiscal());
		} catch (FormatoDataException | InfoAdicionalIncompletaException | NameEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
