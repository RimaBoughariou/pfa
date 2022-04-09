package com.example.pfa.web;

import com.example.pfa.entites.Hotel;
import com.example.pfa.entites.Vol;
import com.example.pfa.service.HotelService;
import com.example.pfa.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
@CrossOrigin(origins = "http://localhost:4200")

public class HotelRestController {


    private final HotelService hotelService;


    @Autowired
    public HotelRestController(HotelService hotelService) {

        this.hotelService= hotelService;

    }

    @GetMapping(path="hotels")
    public List<Hotel> getHotels() {

        return hotelService.gethotels();
    }


    @PostMapping(path="hotels")
    public Hotel addHotel(@RequestBody Hotel hotel) {

        hotelService.addHotel(hotel);

        return hotel ;

    }



}
