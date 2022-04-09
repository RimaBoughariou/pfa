package com.example.pfa.web;

import com.example.pfa.entites.Reservation;
import com.example.pfa.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")


public class ReservationRestController {


    private final ReservationService reservationService;


    @Autowired
    public ReservationRestController(ReservationService reservationService) {

        this.reservationService = reservationService;

    }

    @GetMapping(path="reservations")
    public List<Reservation> getReservations() {

        return reservationService.getReservations();
    }


    @PostMapping(path="reservations")
    public Reservation addReservations(@RequestBody Reservation reservation) {

        reservationService.addReservation(reservation);

        return reservation ;

    }



}


