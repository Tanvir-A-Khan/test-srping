package com.javawhizz.render_app_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public ResponseEntity<String> getData(){
        return new ResponseEntity<>("Bismillahir Rahmanir Rahim", HttpStatus.OK);
    }
}
