package com.learnsecurity.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myLoans")
public class LoansController {
    @GetMapping("/")
    public String getLoanDetails() {
        return "here's the loan details";
    }
}
