package com.example.pfa.service;

import com.example.pfa.entites.Personne;
import com.example.pfa.entites.Reservation;
import com.example.pfa.repositories.PersonneRepository;
import com.example.pfa.repositories.RéservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private  final RéservationRepository réservationRepository;
    @Autowired
    public ReservationService(RéservationRepository réservationRepository) {
        this.réservationRepository = réservationRepository;
    }


    public List<Reservation> getReservations() {

        return  réservationRepository.findAll();
    }
    public Reservation getReservations(Long id) {

        return réservationRepository.findById(id).get();
    }

    public void addReservation(Reservation reservation){

        réservationRepository.save(reservation);
    }
    public void deleteReservation(Long id) {
        boolean exist=réservationRepository.existsById(id);

        if (exist){
            réservationRepository.deleteById(id);
        }else {
            throw new IllegalStateException(
                    "Le personne avec l'id"+id+" n'existe pas "
            );
        };
    }
    public void updateReservation(Long id,Reservation reservation) {

        boolean exist = réservationRepository.existsById(id);

        if (exist) {
            réservationRepository.save(reservation);
        } else {
            throw new IllegalStateException(
                    "La reservation avec l'id"+id+" n'existe pas "
            );
        }
    }

}
