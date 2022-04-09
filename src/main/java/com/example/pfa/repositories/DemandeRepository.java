package com.example.pfa.repositories;

import com.example.pfa.entites.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeRepository extends JpaRepository<Demande,Long> {
}
