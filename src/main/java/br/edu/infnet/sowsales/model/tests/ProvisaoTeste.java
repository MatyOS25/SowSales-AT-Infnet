package br.edu.infnet.sowsales.model.tests;

import br.edu.infnet.sowsales.model.domain.Variedade;
import br.edu.infnet.sowsales.model.domain.Granel;
import br.edu.infnet.sowsales.model.domain.Semente;
import br.edu.infnet.sowsales.model.exceptions.DataPrevNullException;
import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;

public class ProvisaoTeste {
	public static void main(String[] args) {
		
		Semente prov1;
		try {
			prov1 = new Semente("recebimento salario", 1990, "2022-12-25",false);
			System.out.println(prov1);
			System.out.println("Valor Fiscal:"+ prov1.calcularValorFiscal());
		} catch (FormatoDataException | NameEmptyException | DataPrevNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Semente prov2;
		try {
			prov2 = new Semente("recebimento salario", 1990, "2022-12-25");
			System.out.println(prov2);
			System.out.println("Valor Fiscal:"+ prov2.calcularValorFiscal());
		} catch (FormatoDataException | NameEmptyException | DataPrevNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
