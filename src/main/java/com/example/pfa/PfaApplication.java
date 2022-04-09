package com.example.pfa;

import com.example.pfa.entites.Personne;
import com.example.pfa.repositories.PersonneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.PersistenceDelegate;

@SpringBootApplication
public class PfaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfaApplication.class, args);
    }



}
