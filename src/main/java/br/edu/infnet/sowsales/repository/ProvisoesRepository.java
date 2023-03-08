package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.Provisao;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.interfaces.IRepository;
import br.edu.infnet.sowsales.repository.model.RepositoryModel;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class ProvisoesRepository extends RepositoryModel<Provisao> implements IRepository<Provisao> {
    ProvisoesRepository(){
        super();
    }
    public boolean add(Provisao entity){
        return super.add(entity);
    }
    public Provisao remove(Integer key){
      return super.remove(key);  
    }
    public Collection<Provisao> returnList(){
        return super.returnList();
    }
}
