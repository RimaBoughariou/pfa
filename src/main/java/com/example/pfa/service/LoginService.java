package com.example.pfa.service;

import com.example.pfa.entites.Login;
import com.example.pfa.entites.Personne;
import com.example.pfa.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }


    public List<Login> getlogins() {

        return loginRepository.findAll();
    }

    public Login getLogin(Long id) {

        return loginRepository.findById(id).get();
    }

    public void addLogin(Login login) {

        loginRepository.save(login);
    }

    public void deleteLogin(Long id) {
        boolean exist = loginRepository.existsById(id);

        if (exist) {
            loginRepository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "Le personne avec l'id" + id + " n'existe pas "
            );
        }
        ;
    }


    public void updateLogin(Long id, Login login) {

        boolean exist = loginRepository.existsById(id);

        if (exist) {
            loginRepository.save(login);
        } else {
            throw new IllegalStateException(
                    "Le personne avec l'id" + id + " n'existe pas "
            );
        }
    }
}

