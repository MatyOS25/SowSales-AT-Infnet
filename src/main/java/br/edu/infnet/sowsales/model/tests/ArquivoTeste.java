package br.edu.infnet.sowsales.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

public class ArquivoTeste {

	public static void main(String[] args) {
		
		try {
			String arq = "transacoes.txt";
			
			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);
				
				FileWriter fileW = new FileWriter("out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = leitura.readLine();			
				String[] campos = null;
				
				List<Produto> lancamentos = new ArrayList<Produto>();
				Pedido trans = null;

				while(linha != null) {
					
					campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
					case "T":		
						try{
							trans = new Pedido(new User(campos[5], campos[3], campos[4],campos[6]), lancamentos);
							trans.setData(campos[1]);
							trans.setWeb(Boolean.valueOf(campos[2]));
						}
						catch(FormatoDataException | UserIncompletoException e){
								System.out.println("Error:"+ e.getMessage());
						}
						break;
					case "R":					
							SementeTratada reserva;
							try {
								reserva = new SementeTratada(campos[1],Float.valueOf(campos[2]),campos[3]);
								reserva.setInfoAdicional(campos[4]);
								lancamentos.add(reserva);
							} catch (NumberFormatException | FormatoDataException | InfoAdicionalIncompletaException
									| NameEmptyException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						break;
					case "P":	
							Granel partida;
							try{
								partida = new Granel(campos[1],Float.valueOf(campos[2]),new Variedade(campos[3],campos[4],Boolean.valueOf(campos[5])),Boolean.valueOf(campos[6]));
								lancamentos.add(partida);
							}catch(NameEmptyException  | VariedadeEmptyException e){
								e.printStackTrace();
							}		
						break;
					case "PP":		
							Semente provisao;
							try{
								provisao = new Semente(campos[1],Float.valueOf(campos[2]),campos[3],Boolean.valueOf(campos[4]));
								lancamentos.add(provisao);
							}catch(FormatoDataException | NameEmptyException | DataPrevNullException e){
								e.printStackTrace();
							}
						break;

					default:
						System.out.println("Registro inválido!!!");
						break;
					}

					linha = leitura.readLine();
				}
				
				escrita.write(trans.obterLinha());
				
				escrita.close();
				leitura.close();
				fileR.close();
			} catch (IOException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} 
			
		} finally {
			System.out.println("Processamento realizado com sucesso!!!");
		}		
	}
}