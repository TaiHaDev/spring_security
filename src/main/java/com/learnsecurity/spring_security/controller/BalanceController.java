package com.learnsecurity.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myBalance")
public class BalanceController {
    @GetMapping("/")
    public String getBalanceDetails() {
        return "Here are the balance details from the DB";
    }
}
