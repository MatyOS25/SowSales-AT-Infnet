package br.edu.infnet.sowsales.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.sowsales.model.domain.Semente;
import br.edu.infnet.sowsales.model.service.interfaces.IService;
import br.edu.infnet.sowsales.model.service.model.ServiceModel;
import br.edu.infnet.sowsales.repository.SementeRepository;

@Service
public class SementeService extends ServiceModel<SementeRepository,Semente> implements IService<Semente> {

    @Autowired
    private static SementeRepository repository;

    SementeService() {
        super(repository);
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
