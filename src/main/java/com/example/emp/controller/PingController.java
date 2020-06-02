package com.example.emp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @RequestMapping(method = {RequestMethod.GET},value = "/ping")
    public ResponseEntity<String> pingPong(){
        return new ResponseEntity<>("Pong", HttpStatus.OK);
    }
}
