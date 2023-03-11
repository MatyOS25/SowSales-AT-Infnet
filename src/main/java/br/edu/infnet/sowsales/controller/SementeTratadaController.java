package br.edu.infnet.sowsales.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.sowsales.controller.model.ControllerModel;
import br.edu.infnet.sowsales.model.domain.SementeTratada;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.exceptions.DataPrevNullException;
import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.InfoAdicionalIncompletaException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;
import br.edu.infnet.sowsales.model.service.SementeTratadaService;
import br.edu.infnet.sowsales.repository.SementeTratadaRepository;
import br.edu.infnet.sowsales.repository.UserRepository;

@Controller
public class SementeTratadaController extends ControllerModel<SementeTratada, SementeTratadaService>{

    public static final String controller = "sementetratada";

    @Autowired
    private static SementeTratadaService service;

    SementeTratadaController() {
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
    public String post(Model model, @RequestParam String name, @RequestParam LocalDate dataPrev, @RequestParam Float valor, @RequestParam String infoAdicional) {
        SementeTratada entidade = null;
        try {
            entidade = new SementeTratada(name , valor, dataPrev, infoAdicional);
        } catch (FormatoDataException | NameEmptyException | InfoAdicionalIncompletaException e) {
            e.printStackTrace();
        }
        return super.post(model, entidade);
    }

    @GetMapping(value = "/"+ controller +"/{id}/excluir")
    public String getRemove(@PathVariable Integer id) {
        return super.getRemove(id);
    }
}
