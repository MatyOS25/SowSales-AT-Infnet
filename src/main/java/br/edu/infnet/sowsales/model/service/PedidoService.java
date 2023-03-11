package br.edu.infnet.sowsales.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.sowsales.model.domain.Pedido;
import br.edu.infnet.sowsales.model.domain.Produto;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.interfaces.IService;
import br.edu.infnet.sowsales.model.service.model.ServiceModel;
import br.edu.infnet.sowsales.repository.PedidoRepository;
import br.edu.infnet.sowsales.repository.ProdutoRepository;
import br.edu.infnet.sowsales.repository.UserRepository;

@Service
public class PedidoService extends ServiceModel<PedidoRepository,Pedido> implements IService<Pedido>  {

    @Autowired
    private static PedidoRepository repository;

    PedidoService() {
        super(repository);
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
