package com.poc.ticketsystem.controller;

import com.poc.ticketsystem.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TicketSystemController {
    @GetMapping(value = "/")
    public ResponseEntity<String> findById(){
        return ResponseEntity.ok("welcome");
    }

}
