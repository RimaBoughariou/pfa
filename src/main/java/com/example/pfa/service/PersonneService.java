package com.example.pfa.service;

import com.example.pfa.entites.Personne;
import com.example.pfa.repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pfa.repositories.PersonneRepository.*;

@Service
public class PersonneService {

    private  final PersonneRepository personneRepository;

    @Autowired
    public PersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }


    public List<Personne> getPersonnes() {

        return  personneRepository.findAll();
    }

    public Personne getPersonne(Long id) {

        return personneRepository.findById(id).get();
    }

    public void addPersonne(Personne personne){

        personneRepository.save(personne);
    }

    public void deletePersonne(Long id) {
        boolean exist=personneRepository.existsById(id);

        if (exist){
            personneRepository.deleteById(id);
        }else {
            throw new IllegalStateException(
                    "Le personne avec l'id"+id+" n'existe pas "
            );
        };
    }


    public void updatePersonne(Long id,Personne personne) {

        boolean exist = personneRepository.existsById(id);

        if (exist) {
            personneRepository.save(personne);
        } else {
            throw new IllegalStateException(
                    "Le personne avec l'id"+id+" n'existe pas "
            );
        }
    }

}