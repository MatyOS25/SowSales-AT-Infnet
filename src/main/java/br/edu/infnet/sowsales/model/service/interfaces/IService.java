package br.edu.infnet.sowsales.model.service.interfaces;

import java.util.Collection;

public interface IService<T> {
    public boolean add(T entity);

    public T remove(Integer key);

    public Collection<T> returnList();
}
