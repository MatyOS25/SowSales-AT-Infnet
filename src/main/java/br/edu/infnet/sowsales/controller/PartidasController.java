package br.edu.infnet.sowsales.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.sowsales.model.domain.Partida;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.repository.PartidasRepository;
import br.edu.infnet.sowsales.repository.UserRepository;

@Controller
public class PartidasController {
    private String msg;

    @GetMapping(value = "/partidas/lista")
	public String getReceitas(Model model) {
        model.addAttribute("lista", PartidasRepository.returnList());
        model.addAttribute("mensagem", msg); 
        msg = null;
		return "partidas/lista";
	}

    @GetMapping(value = "/partidas/new")
    public String getTelaCadastro() {
        return "partidas/new";
    }

    @PostMapping(value = "/partidas/new")
    public String post(Model model, Partida entidade) {
        System.out.println("Return Transacao: " + entidade);

        try {
        var response = PartidasRepository.add(entidade);
        if (response == false) {
            throw new Exception("Error ao incluir");
        }
        msg = entidade.getId() + " incluido com sucesso!";
        return "redirect:/partidas/lista";

        } catch (Exception e) {
        System.out.println("Falha ao cadastrar! ");
        return getTelaCadastro();
        }
    }

    @GetMapping(value = "/partidas/{id}/excluir")
    public String getRemove(@PathVariable Integer id) {
        Partida entidade = PartidasRepository.remove(id);
        msg = "Exclusão " + entidade.getId() + " realizada com sucesso";
        return "redirect:/partidas/lista";
    }
    
}