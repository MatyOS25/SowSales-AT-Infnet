package br.edu.infnet.sowsales.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.sowsales.controller.model.ControllerModel;
import br.edu.infnet.sowsales.model.domain.Semente;
import br.edu.infnet.sowsales.model.exceptions.DataPrevNullException;
import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;
import br.edu.infnet.sowsales.model.service.SementeService;

@Controller
public class SementeController extends ControllerModel<Semente, SementeService> {
    public static final String controller = "semente";

    @Autowired
    private static SementeService service;

    SementeController() {
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
    public String post(Model model, @RequestParam String name, @RequestParam LocalDate dataPrev, @RequestParam Float valor, @RequestParam Boolean saida) {
        Semente entidade = null;
        try {
            entidade = new Semente(name , valor, dataPrev, saida);
        } catch (FormatoDataException | NameEmptyException | DataPrevNullException e) {
            e.printStackTrace();
        }
        return super.post(model, entidade);
    }

    @GetMapping(value = "/"+ controller +"/{id}/excluir")
    public String getRemove(@PathVariable Integer id) {
        return super.getRemove(id);
    }
}