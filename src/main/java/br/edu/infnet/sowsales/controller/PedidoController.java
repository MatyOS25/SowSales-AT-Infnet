package br.edu.infnet.sowsales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.sowsales.controller.model.ControllerModel;
import br.edu.infnet.sowsales.model.domain.Pedido;
import br.edu.infnet.sowsales.model.service.PedidoService;

@Controller
public class PedidoController extends ControllerModel<Pedido,PedidoService>{

    public static final String controller = "pedido";

    @Autowired
    private static PedidoService service;


    PedidoController(){
        super(service,controller);
    }

    @GetMapping(value = "/"+ controller + "/lista")
	public String getLista(Model model) {
        return super.getLista(model);
	}

    @GetMapping(value = "/" + controller + "/new")
    public String getTelaCadastro() {
        return super.getTelaCadastro();
    }

    @PostMapping(value = "/"+ controller +"/new")
    public String post(Model model, Pedido entidade) {
        return super.post(model, entidade);
    }

    @GetMapping(value = "/"+ controller +"/{id}/excluir")
    public String getRemove(@PathVariable Integer id) {
        return super.getRemove(id);
    }


}
