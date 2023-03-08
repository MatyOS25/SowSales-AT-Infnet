package br.edu.infnet.sowsales.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
				
				List<Lancamento> lancamentos = new ArrayList<Lancamento>();
				Transacao trans = null;

				while(linha != null) {
					
					campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
					case "T":		
						try{
							trans = new Transacao(new User(campos[5], campos[3], campos[4],campos[6]), lancamentos);
							trans.setData(campos[1]);
							trans.setWeb(Boolean.valueOf(campos[2]));
						}
						catch(FormatoDataException | UserIncompletoException e){
								System.out.println("Error:"+ e.getMessage());
						}
						break;
					case "R":					
							Reserva reserva;
							try {
								reserva = new Reserva(campos[1],Float.valueOf(campos[2]),campos[3]);
								reserva.setInfoAdicional(campos[4]);
								lancamentos.add(reserva);
							} catch (NumberFormatException | FormatoDataException | InfoAdicionalIncompletaException
									| NameEmptyException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						break;
					case "P":	
							Partida partida;
							try{
								partida = new Partida(campos[1],Float.valueOf(campos[2]),new Conta(campos[3],campos[4],Boolean.valueOf(campos[5])),Boolean.valueOf(campos[6]));
								lancamentos.add(partida);
							}catch(NameEmptyException  | ContaEmptyException e){
								e.printStackTrace();
							}		
						break;
					case "PP":		
							Provisao provisao;
							try{
								provisao = new Provisao(campos[1],Float.valueOf(campos[2]),campos[3],Boolean.valueOf(campos[4]));
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