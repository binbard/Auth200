package com.binbard.auth200.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    public String home(){
        return "There is nothing up here. Checkout '/api' and our documentation.";
    }
}
