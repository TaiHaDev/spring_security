package com.learnsecurity.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContractController {
    @GetMapping("/")
    public String getContactDetail(){
        return "contacts";
    }
}
