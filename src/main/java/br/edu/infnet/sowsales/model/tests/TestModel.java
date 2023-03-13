package br.edu.infnet.sowsales.model.tests;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.sowsales.model.service.interfaces.ITest;

public class TestModel<T extends ITest<T>> {

    public void newObject(T t){
        try{
            T object = (T)t.getClass().newInstance();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void populateObjectSimple(String classe){
        try {
			String arq = classe +".txt";
			
			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);
				
				FileWriter fileW = new FileWriter("out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = leitura.readLine();			
				String[] campos = null;
				
				List<T> lista = new ArrayList<T>();

                T model;

				while(linha != null) {
					
					campos = linha.split(";");
					
						try{
                            Class<? extends ITest> object = model.getClass();
                            Constructor<?>[] cons = object.getConstructors();
                            int param = cons[0].getParameterCount();
                            List<Integer> params = new ArrayList<Integer>();
                            for (int i = 0; i < param; i++) {
                                params.add(i);
                            }
                            model = (T) cons[0].newInstance(params);
                            
                            
							trans = new Pedido(new User(campos[5], campos[3], campos[4],campos[6]), lancamentos);
							trans.setData(campos[1]);
							trans.setWeb(Boolean.valueOf(campos[2]));
						}
						catch(FormatoDataException | UserIncompletoException e){
								System.out.println("Error:"+ e.getMessage());
						}
									
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
