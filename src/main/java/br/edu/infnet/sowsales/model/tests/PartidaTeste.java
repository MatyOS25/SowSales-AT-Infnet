package br.edu.infnet.sowsales.model.tests;

import br.edu.infnet.sowsales.model.domain.Variedade;
import br.edu.infnet.sowsales.model.domain.Granel;
import br.edu.infnet.sowsales.model.exceptions.VariedadeEmptyException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;

public class PartidaTeste {
	public static void main(String[] args) {
		Variedade conta = new Variedade("Empresa de Tecnologia", "Santander", true);
		
		Granel part1;
		try {
			part1 = new Granel("recebimento salario", 1990, conta,true);
			System.out.println(part1);
			System.out.println("Valor Fiscal:"+ part1.calcularValorFiscal());
		} catch (NameEmptyException | VariedadeEmptyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Variedade conta1 = new Variedade("Conta Pessoal", "Santander", true);
		Granel part2;
		try {
			part2 = new Granel("conta bancaria", 1990, conta1,false);
			System.out.println(part2);
			System.out.println("Valor Fiscal:"+ part2.calcularValorFiscal());
		} catch (NameEmptyException | VariedadeEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
