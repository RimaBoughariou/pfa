package com.example.pfa.web;

import com.example.pfa.entites.Bus;
import com.example.pfa.entites.Vol;
import com.example.pfa.service.BusService;
import com.example.pfa.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
@CrossOrigin(origins = "http://localhost:4200")

public class BusRestController {


    private final BusService busService;


    @Autowired
    public BusRestController(BusService busService) {

        this.busService= busService;

    }

    @GetMapping(path="bus")
    public List<Bus> getBus() {

        return busService.getbus();
    }


    @PostMapping(path="bus")
    public Bus addBus(@RequestBody Bus bus) {

        busService.addBus(bus);

        return bus ;

    }



}