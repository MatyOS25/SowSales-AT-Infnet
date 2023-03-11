package br.edu.infnet.sowsales.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.sowsales.model.domain.Granel;
import br.edu.infnet.sowsales.model.service.interfaces.IService;
import br.edu.infnet.sowsales.model.service.model.ServiceModel;
import br.edu.infnet.sowsales.repository.GranelRepository;

@Service
public class GranelService extends ServiceModel<GranelRepository,Granel> implements IService<Granel>{
    @Autowired
    private static GranelRepository repository;
    
    GranelService(){
        super(repository);
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
