package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.SementeTratada;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.interfaces.IRepository;
import br.edu.infnet.sowsales.repository.model.RepositoryModel;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class SementeTratadaRepository extends RepositoryModel<SementeTratada> implements IRepository<SementeTratada> {
    SementeTratadaRepository(){
        super();
    }
    public boolean add(SementeTratada entity){
        return super.add(entity);
    }
    public SementeTratada remove(Integer key){
      return super.remove(key);  
    }
    public Collection<SementeTratada> returnList(){
        return super.returnList();
    }
}
