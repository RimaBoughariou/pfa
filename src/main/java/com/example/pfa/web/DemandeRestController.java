package com.example.pfa.web;

import com.example.pfa.entites.Demande;
import com.example.pfa.repositories.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemandeRestController {
    private DemandeRepository demandeRepository;

    public DemandeRestController(DemandeRepository demandeRepository) {
               this.demandeRepository=demandeRepository;
    }
    @GetMapping(path="/Demandes")
    public List<Demande> listdemandes() {
        return demandeRepository.findAll();
    }
}
