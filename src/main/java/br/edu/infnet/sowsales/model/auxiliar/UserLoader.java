package br.edu.infnet.sowsales.model.auxiliar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.sowsales.model.domain.User;
import br.edu.infnet.sowsales.model.service.UserService;

@Component
public class UserLoader implements ApplicationRunner{

    @Autowired
    private UserService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Populating on startup....");
        User admin = new User("admin@admin.com", "123123","Admin", "000.000.000-90");
        service.add(admin);
    }
    
}
