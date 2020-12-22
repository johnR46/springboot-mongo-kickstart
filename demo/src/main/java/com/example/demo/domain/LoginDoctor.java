package com.example.demo.domain;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class LoginDoctor {
    @Id
    private String idLoginDoctor;
    private String userId;
    private String userPassword;
}
