package com.binbard.auth200.services;

import com.binbard.auth200.entities.AdminEntity;
import com.binbard.auth200.models.AdminDTO;
import com.binbard.auth200.repositories.AdminRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    private final ModelMapper modelMapper;

    public AdminService(AdminRepository adminRepository, ModelMapper modelMapper){
        this.adminRepository = adminRepository;
        this.modelMapper = modelMapper;
    }

    public List<AdminDTO> getAllAdmins(){
        return adminRepository
                .findAll()
                .stream()
                .map(adminEntity -> modelMapper.map(adminEntity, AdminDTO.class))
                .collect(Collectors.toList());
    }

    public void createAdmin(AdminDTO admin){
        adminRepository.save(modelMapper.map(admin, AdminEntity.class));
    }
}
