package br.edu.infnet.sowsales.model.service.model;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.sowsales.model.service.interfaces.IRepository;


public class ServiceModel<R extends IRepository<T>,T> {
    @Autowired
    private R repository;

    protected ServiceModel(R repository){
        this.repository = repository;
    }

    public boolean add(T entity){
        return repository.add(entity);
    }

    public T remove(Integer key){
        return repository.remove(key);
    }

    public Collection<T> returnList(){
        return repository.returnList();
    }
}
