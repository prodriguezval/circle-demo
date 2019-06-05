package com.thoughtworks.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/ping")

    public ResponseEntity<?> handlePing() {
        return ResponseEntity.ok("pong");
    }

}
