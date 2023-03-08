package br.edu.infnet.sowsales.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.sowsales.model.domain.Reserva;
import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.exceptions.FormatoDataException;
import br.edu.infnet.sowsales.model.exceptions.InfoAdicionalIncompletaException;
import br.edu.infnet.sowsales.model.exceptions.NameEmptyException;
import br.edu.infnet.sowsales.repository.ReservaRepository;
import br.edu.infnet.sowsales.repository.UserRepository;

@Controller
public class ReservaController {
    private String msg;

    @GetMapping(value = "/reservas/lista")
	public String getReceitas(Model model) {
        model.addAttribute("lista", ReservaRepository.returnList());
        model.addAttribute("mensagem", msg); 
        msg = null;
		return "reservas/lista";
	}

    @GetMapping(value = "/reservas/new")
    public String getTelaCadastro() {
        return "reservas/new";
    }

    @PostMapping(value = "/reservas/new")
    public String post(Model model, @RequestParam String name, @RequestParam LocalDate dataPrev, @RequestParam Float valor, @RequestParam String infoAdicional) {
        Reserva entidade = null;
        try {
            entidade = new Reserva(name , valor, dataPrev, infoAdicional);
        } catch (FormatoDataException | InfoAdicionalIncompletaException | NameEmptyException e) {

            e.printStackTrace();
        }
        System.out.println("Return Transacao: " + entidade);

        try {
        var response = ReservaRepository.add(entidade);
        if (response == false) {
            throw new Exception("Error ao incluir");
        }
        msg = "Reserva-" + entidade.getId() + " incluido com sucesso!";
        return "redirect:/reservas/lista";

        } catch (Exception e) {
        System.out.println("Falha ao cadastrar! ");
        return getTelaCadastro();
        }
    }

    @GetMapping(value = "/reservas/{id}/excluir")
    public String getRemove(@PathVariable Integer id) {
        Reserva entidade = ReservaRepository.remove(id);
        msg = "Exclusão " + entidade.getId() + " realizada com sucesso";
        return "redirect:/reservas/lista";
    }
}
