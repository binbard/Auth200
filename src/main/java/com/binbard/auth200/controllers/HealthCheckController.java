package com.binbard.auth200.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthCheckController {

    @GetMapping
    public Map<String, Object> getHealth() {
        Map<String, Object> statusData = new HashMap<>();
        statusData.put("status", "success");
        statusData.put("live", true);
        return statusData;
    }
}
