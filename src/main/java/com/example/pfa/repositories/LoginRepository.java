package com.example.pfa.repositories;

import com.example.pfa.entites.Itineraire;
import com.example.pfa.entites.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Long> {
    Login findByEmail(String email);
}
