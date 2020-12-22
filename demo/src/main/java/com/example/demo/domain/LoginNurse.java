package com.example.demo.domain;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class LoginNurse {
    @Id
    private String idLoginNurse;
    private String userId;
    private String userPassword;
}
