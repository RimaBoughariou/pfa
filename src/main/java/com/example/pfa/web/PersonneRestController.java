package com.example.pfa.web;

import com.example.pfa.entites.Personne;
import com.example.pfa.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")


public class PersonneRestController {


    private final PersonneService personneService;


    @Autowired
    public PersonneRestController(PersonneService personneService) {

        this.personneService = personneService;

    }

    @GetMapping(path="personnes")
    public List<Personne> getPersonnes() {

        return personneService.getPersonnes();
    }


    @PostMapping(path="personnes")
    public Personne addPersonne(@RequestBody Personne personne) {

       personneService.addPersonne(personne);

        return personne ;

    }



}
