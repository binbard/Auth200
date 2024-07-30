package com.binbard.auth200.controllers;

import com.binbard.auth200.models.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminContoller {

    @GetMapping
    public String createNewAdmin(Admin admin){
        return "Created new Admin";
    }
}
