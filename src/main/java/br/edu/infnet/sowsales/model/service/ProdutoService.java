package br.edu.infnet.sowsales.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.sowsales.model.domain.Produto;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.interfaces.IService;
import br.edu.infnet.sowsales.model.service.model.ServiceModel;
import br.edu.infnet.sowsales.repository.ProdutoRepository;
import br.edu.infnet.sowsales.repository.UserRepository;

@Service
public class ProdutoService extends ServiceModel<ProdutoRepository,Produto> implements IService<Produto>  {

    @Autowired
    private static ProdutoRepository repository;

    ProdutoService() {
        super(repository);
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
