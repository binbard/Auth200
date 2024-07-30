package com.binbard.auth200.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Admin {
    private Long id;
    private String email;
    private String password;
    private String otp;
}