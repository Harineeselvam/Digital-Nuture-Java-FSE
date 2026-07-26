package com.smartlibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public String getAccount(@PathVariable String number) {

        return "{ \"number\":\"" + number +
               "\", \"type\":\"Savings\", \"balance\":50000 }";
    }
}