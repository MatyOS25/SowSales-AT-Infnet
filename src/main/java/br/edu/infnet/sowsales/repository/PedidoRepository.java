package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.Pedido;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.interfaces.IRepository;
import br.edu.infnet.sowsales.repository.model.RepositoryModel;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class PedidoRepository extends RepositoryModel<Pedido> implements IRepository<Pedido>{
    PedidoRepository(){
        super();
    }

    public boolean add(Pedido entity){
        return super.add(entity);
    }
    public Pedido remove(Integer key){
      return super.remove(key);  
    }
    public Collection<Pedido> returnList(){
        return super.returnList();
    }



}
