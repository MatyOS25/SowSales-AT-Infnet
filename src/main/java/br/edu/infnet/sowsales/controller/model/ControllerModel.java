package br.edu.infnet.sowsales.controller.model;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import br.edu.infnet.sowsales.model.service.interfaces.IModel;
import br.edu.infnet.sowsales.model.service.interfaces.IService;

public class ControllerModel<T extends IModel, S extends IService<T>> {
    private String msg;
    public String controller;

    @Autowired
    public S service;

    protected ControllerModel(S service, String controller){
        this.service = service;
        this.controller = controller;
    }

    protected Model returnControllerRoute(Model model){
        return model.addAttribute("controller", controller); 
    }

	public String getLista(Model model) {
        model.addAttribute("lista", service.returnList());
        model.addAttribute("mensagem", msg); 
        returnControllerRoute(model);
        msg = null;
		return controller +"/lista";
	}

    public String getTelaCadastro() {
        return controller + "/new";
    }

    public String post(Model model, T entidade) {
        System.out.println("Return Transacao: " + entidade);
        returnControllerRoute(model);
        try {
        var response = service.add(entidade);
        if (response == false) {
            throw new Exception("Error ao incluir");
        }
        msg = entidade.getId() + " incluido com sucesso!";
        return "redirect:/lancamentos/lista";

        } catch (Exception e) {
        System.out.println("Falha ao cadastrar! ");
        return getTelaCadastro();
        }
    }

    public String getRemove(Integer id) {
        T entidade = service.remove(id);
        msg = "Exclusão " + entidade.getId() + " realizada com sucesso";
        return "redirect:/"+ controller + "/lista";
    }
}
