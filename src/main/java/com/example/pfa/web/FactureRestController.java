package com.example.pfa.web;


import com.example.pfa.entites.Facture;
import com.example.pfa.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FactureRestController {
    private FactureRepository factureRepository;

    public FactureRestController(FactureRepository factureRepository) {
        this.factureRepository=factureRepository;
    }
    @GetMapping(path="/Factures")
    public List<Facture> listfactures() {
        return factureRepository.findAll();
    }

}
