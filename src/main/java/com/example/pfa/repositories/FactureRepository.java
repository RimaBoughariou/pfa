package com.example.pfa.repositories;

import com.example.pfa.entites.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
