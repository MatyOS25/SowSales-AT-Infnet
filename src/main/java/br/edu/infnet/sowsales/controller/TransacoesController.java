package br.edu.infnet.sowsales.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.sowsales.model.domain.Transacao;
import br.edu.infnet.sowsales.repository.TransacoesRepository;

@Controller
public class TransacoesController {
    private String msg;

    @GetMapping(value = "/transacoes/lista")
	public String getReceitas(Model model) {
        model.addAttribute("lista", TransacoesRepository.returnList());
        model.addAttribute("mensagem", msg); 
        msg = null;
		return "transacoes/lista";
	}

    @GetMapping(value = "/transacoes/new")
    public String getTelaCadastro() {
        return "transacoes/new";
    }

    @PostMapping(value = "/transacoes/new")
    public String post(Model model, Transacao entidade) {
        System.out.println("Return Transacao: " + entidade);

        try {
        var response = TransacoesRepository.add(entidade);
        if (response == false) {
            throw new Exception("Error ao incluir");
        }
        msg = entidade.getId() + " incluido com sucesso!";
        return "redirect:/transacoes/lista";

        } catch (Exception e) {
        System.out.println("Falha ao cadastrar! ");
        return getTelaCadastro();
        }
    }

    @GetMapping(value = "/transacoes/{id}/excluir")
    public String getRemove(@PathVariable Integer id) {
        Transacao entidade = TransacoesRepository.remove(id);
        msg = "Exclusão " + entidade.getId() + " realizada com sucesso";
        return "redirect:/transacoes/lista";
    }


}
