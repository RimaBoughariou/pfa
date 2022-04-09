package com.example.pfa.web;

import com.example.pfa.entites.Login;
import com.example.pfa.repositories.LoginRepository;
import com.example.pfa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
@CrossOrigin(origins = "http://localhost:4200")

public class LoginRestController {


    private final LoginService loginService;


    @Autowired
    public LoginRestController(LoginService loginService) {

        this.loginService = loginService;

    }

    @GetMapping(path="logins")
    public List<Login> getLogins() {

        return loginService.getlogins();
    }


    @PostMapping(path="logins")
    public Login addLogin(@RequestBody Login login) {

        loginService.addLogin(login);

        return login ;

    }
    @Autowired
    private LoginRepository repo;
    @PostMapping(path = "login")
    public ResponseEntity<?> loginpelerin(@RequestBody Login logindata){
        Login login=repo.findByEmail(logindata.getEmail());
        if(login.getPassword().equals(logindata.getPassword()))
            return ResponseEntity.ok(login);
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }



}
