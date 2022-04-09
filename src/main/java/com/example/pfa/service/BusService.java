package com.example.pfa.service;


import com.example.pfa.entites.Bus;
import com.example.pfa.entites.Vol;
import com.example.pfa.repositories.BusRepository;
import com.example.pfa.repositories.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class   BusService {

    private final BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }


    public List<Bus> getbus() {

        return busRepository.findAll();
    }

    public Bus getBus(Long id) {

        return busRepository.findById(id).get();
    }

    public void addBus(Bus bus) {

        busRepository.save(bus);
    }

    public void deleteBus(Long id) {
        boolean exist = busRepository.existsById(id);

        if (exist) {
            busRepository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "Le bus avec " + id + " n'existe pas "
            );
        }
        ;
    }


    public void updateBus(Long id, Bus bus) {

        boolean exist = busRepository.existsById(id);

        if (exist) {
            busRepository.save(bus);
        } else {
            throw new IllegalStateException(
                    "Le bus avec l'id" + id + " n'existe pas "
            );
        }
    }
}


