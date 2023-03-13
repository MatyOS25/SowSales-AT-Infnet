package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.Semente;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.interfaces.IRepository;
import br.edu.infnet.sowsales.repository.model.RepositoryModel;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class SementeRepository extends RepositoryModel<Semente> implements IRepository<Semente> {
    SementeRepository(){
        super();
    }
    public boolean add(Semente entity){
        return super.add(entity);
    }
    public Semente remove(Integer key){
      return super.remove(key);  
    }
    public Collection<Semente> returnList(){
        return super.returnList();
    }
}
