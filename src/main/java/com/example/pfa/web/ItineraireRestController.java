package com.example.pfa.web;

import com.example.pfa.entites.Itineraire;
import com.example.pfa.repositories.ItineraireRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItineraireRestController {
    private ItineraireRepository itinéraireRepository;

    public ItineraireRestController(ItineraireRepository itinéraireRepository) {
        this.itinéraireRepository=itinéraireRepository;
    }
    @GetMapping(path="/Itinéraires")
    public List<Itineraire> listitinéraires() {
        return itinéraireRepository.findAll();
    }

}
