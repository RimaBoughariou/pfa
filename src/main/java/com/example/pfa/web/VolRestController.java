package com.example.pfa.web;

import com.example.pfa.entites.Login;
import com.example.pfa.entites.Vol;
import com.example.pfa.repositories.LoginRepository;
import com.example.pfa.repositories.VolRepository;
import com.example.pfa.service.LoginService;
import com.example.pfa.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
@CrossOrigin(origins = "http://localhost:4200")

public class VolRestController {


    private final VolService volService;


    @Autowired
    public VolRestController(VolService volService) {

        this.volService= volService;

    }

    @GetMapping(path="vols")
    public List<Vol> getVols() {

        return volService.getvols();
    }


    @PostMapping(path="vols")
    public Vol addVol(@RequestBody Vol vol) {

        volService.addVol(vol);

        return vol ;

    }
   


}