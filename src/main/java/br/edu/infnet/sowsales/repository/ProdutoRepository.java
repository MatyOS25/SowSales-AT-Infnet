package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.Produto;
import br.edu.infnet.sowsales.model.service.interfaces.IRepository;
import br.edu.infnet.sowsales.repository.model.RepositoryModel;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class  ProdutoRepository extends RepositoryModel<Produto> implements IRepository<Produto> {
    ProdutoRepository(){
        super();
    }
    public boolean add(Produto entity){
        return super.add(entity);
    }
    public Produto remove(Integer key){
      return super.remove(key);  
    }
    public Collection<Produto> returnList(){
        return super.returnList();
    }
}
