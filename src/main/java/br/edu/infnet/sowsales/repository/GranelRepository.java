package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.Granel;
import br.edu.infnet.sowsales.model.service.interfaces.IRepository;
import br.edu.infnet.sowsales.repository.model.RepositoryModel;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class GranelRepository extends RepositoryModel<Granel> implements IRepository<Granel>{
    GranelRepository(){
        super();
    }
    public boolean add(Granel entity){
        return super.add(entity);
    }
    public Granel remove(Integer key){
      return super.remove(key);  
    }
    public Collection<Granel> returnList(){
        return super.returnList();
    }
}
