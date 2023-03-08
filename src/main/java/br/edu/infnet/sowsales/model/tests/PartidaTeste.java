package br.edu.infnet.sowsales.model.tests;

import br.edu.infnet.sowsales.model.domain.Conta;
import br.edu.infnet.sowsales.model.domain.Partida;
import br.edu.infnet.sowsales.model.exceptions.ContaEmptyException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;

public class PartidaTeste {
	public static void main(String[] args) {
		Conta conta = new Conta("Empresa de Tecnologia", "Santander", true);
		
		Partida part1;
		try {
			part1 = new Partida("recebimento salario", 1990, conta,true);
			System.out.println(part1);
			System.out.println("Valor Fiscal:"+ part1.calcularValorFiscal());
		} catch (NameEmptyException | ContaEmptyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Conta conta1 = new Conta("Conta Pessoal", "Santander", true);
		Partida part2;
		try {
			part2 = new Partida("conta bancaria", 1990, conta1,false);
			System.out.println(part2);
			System.out.println("Valor Fiscal:"+ part2.calcularValorFiscal());
		} catch (NameEmptyException | ContaEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
