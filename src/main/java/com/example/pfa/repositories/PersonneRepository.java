package com.example.pfa.repositories;

import com.example.pfa.entites.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
    Personne findByEmail(String email);
}
