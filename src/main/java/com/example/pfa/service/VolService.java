package com.example.pfa.service;

import com.example.pfa.entites.Login;
import com.example.pfa.entites.Vol;
import com.example.pfa.repositories.LoginRepository;
import com.example.pfa.repositories.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
    public class VolService {

        private final VolRepository volRepository;

        @Autowired
        public VolService(VolRepository volRepository) {
            this.volRepository = volRepository;
        }


        public List<Vol> getvols() {

            return volRepository.findAll();
        }

        public Vol getLogin(Long id) {

            return volRepository.findById(id).get();
        }

        public void addVol(Vol vol) {

            volRepository.save(vol);
        }

        public void deleteVol(Long id) {
            boolean exist = volRepository.existsById(id);

            if (exist) {
                volRepository.deleteById(id);
            } else {
                throw new IllegalStateException(
                        "La vol avec l'id" + id + " n'existe pas "
                );
            }
            ;
        }


        public void updateVol(Long id, Vol vol) {

            boolean exist = volRepository.existsById(id);

            if (exist) {
                volRepository.save(vol);
            } else {
                throw new IllegalStateException(
                        "La vol avec l'id" + id + " n'existe pas "
                );
            }
        }
    }


