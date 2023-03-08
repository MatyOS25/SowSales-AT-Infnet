package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.Lancamento;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.interfaces.IRepository;
import br.edu.infnet.sowsales.repository.model.RepositoryModel;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class LancamentosRepository extends RepositoryModel<Lancamento> implements IRepository<Lancamento> {
    LancamentosRepository(){
        super();
    }
    public boolean add(Lancamento entity){
        return super.add(entity);
    }
    public Lancamento remove(Integer key){
      return super.remove(key);  
    }
    public Collection<Lancamento> returnList(){
        return super.returnList();
    }
}
