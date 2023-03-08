package br.edu.infnet.sowsales.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.sowsales.model.domain.Provisao;
import br.edu.infnet.sowsales.model.service.interfaces.IService;
import br.edu.infnet.sowsales.model.service.model.ServiceModel;
import br.edu.infnet.sowsales.repository.ProvisoesRepository;

@Service
public class ProvisaoService extends ServiceModel<ProvisoesRepository,Provisao> implements IService<Provisao> {

    @Autowired
    private static ProvisoesRepository repository;

    ProvisaoService() {
        super(repository);
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
