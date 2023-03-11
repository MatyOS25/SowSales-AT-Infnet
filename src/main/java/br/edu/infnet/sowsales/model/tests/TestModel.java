package br.edu.infnet.sowsales.model.tests;


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
}
