package br.edu.infnet.sowsales.repository.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.service.interfaces.IModel;


public class RepositoryModel<T extends IModel> {
    
    private Integer id = 1;
    private Map<Integer,T> mappedEntity = new HashMap<Integer, T>();
    public boolean add(T entity){
        try{
            entity.setId(id++);
            mappedEntity.put(entity.getId(),entity);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public T remove(Integer key){
      return mappedEntity.remove(key);  
    }
    public Collection<T> returnList(){
        return  mappedEntity.values();
    }
}
