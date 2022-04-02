package com.example.java_group_11_controlwork_7_ilya_enikeev.controller;

import com.example.java_group_11_controlwork_7_ilya_enikeev.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
    private final CustomerService customerService;

    public RegistrationController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<String> addUser(String name, String email, String password) {
        try {
            customerService.addUser(name, email, password);
            return ResponseEntity.ok().build();
        } catch (SecurityException se) {
            return new ResponseEntity<>("There is already a user with the given email", HttpStatus.BAD_REQUEST);
        }
    }
}
