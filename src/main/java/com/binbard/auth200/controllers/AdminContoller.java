package com.binbard.auth200.controllers;

import com.binbard.auth200.models.AdminDTO;
import com.binbard.auth200.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminContoller {
    private final AdminService adminService;

    public AdminContoller(AdminService adminService){
        this.adminService = adminService;
    }

    @GetMapping("/all")
    public List<AdminDTO> listAllAdmins(){
        return adminService.getAllAdmins();
    }

    @PostMapping(path = "/signup")
    public void createNewAdmin(@RequestBody AdminDTO admin) {
        adminService.createAdmin(admin);
    }
}
