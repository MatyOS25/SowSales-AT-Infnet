package br.edu.infnet.sowsales.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.sowsales.model.domain.SementeTratada;
import br.edu.infnet.sowsales.model.service.interfaces.IService;
import br.edu.infnet.sowsales.model.service.model.ServiceModel;
import br.edu.infnet.sowsales.repository.SementeTratadaRepository;

@Service
public class SementeTratadaService extends ServiceModel<SementeTratadaRepository,SementeTratada> implements IService<SementeTratada>{

    @Autowired
    private static SementeTratadaRepository repository;

    SementeTratadaService() {
        super(repository);
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
