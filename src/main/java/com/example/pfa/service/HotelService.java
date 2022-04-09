package com.example.pfa.service;

import com.example.pfa.entites.Hotel;
import com.example.pfa.entites.Vol;
import com.example.pfa.repositories.HotelRepository;
import com.example.pfa.repositories.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }


    public List<Hotel> gethotels() {

        return hotelRepository.findAll();
    }

    public Hotel getHotel(Long id) {

        return hotelRepository.findById(id).get();
    }

    public void addHotel(Hotel hotel) {

        hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) {
        boolean exist = hotelRepository.existsById(id);

        if (exist) {
            hotelRepository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "L'hotel' avec l'id" + id + " n'existe pas "
            );
        }
        ;
    }


    public void updateVol(Long id, Hotel hotel) {

        boolean exist = hotelRepository.existsById(id);

        if (exist) {
            hotelRepository.save(hotel);
        } else {
            throw new IllegalStateException(
                    "La vol avec l'id" + id + " n'existe pas "
            );
        }
    }
}