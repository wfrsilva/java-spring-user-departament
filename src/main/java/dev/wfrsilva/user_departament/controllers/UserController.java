package dev.wfrsilva.user_departament.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.wfrsilva.user_departament.entities.User;
import dev.wfrsilva.user_departament.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;
    
    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
            return result;
    }//findAll

}//UserController
