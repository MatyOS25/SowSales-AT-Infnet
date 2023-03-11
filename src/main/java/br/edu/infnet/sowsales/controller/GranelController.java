package br.edu.infnet.sowsales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.sowsales.controller.model.ControllerModel;
import br.edu.infnet.sowsales.model.domain.Granel;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.GranelService;
import br.edu.infnet.sowsales.repository.GranelRepository;
import br.edu.infnet.sowsales.repository.UserRepository;

@Controller
public class GranelController<LocalDate> extends ControllerModel<Granel, GranelService>{
    public static final String controller = "granel";

    @Autowired
    private static GranelService service;

    GranelController() {
        super(service, controller);
        
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
    public String post(Model model, 
        @RequestParam String name, 
        @RequestParam LocalDate dataPrev, 
        @RequestParam Float valor, 
        @RequestParam Boolean saida) {

        Granel entidade = null;
        try {
            entidade = new Granel(name , valor, dataPrev, saida);
        } catch (FormatoDataException | NameEmptyException | DataPrevNullException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return super.post(model, entidade);
    }

    @GetMapping(value = "/"+ controller +"/{id}/excluir")
    public String getRemove(@PathVariable Integer id) {
        return super.getRemove(id);
    }
}