package com.example.demo.domain;


import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class RegisterPatient {
    @Id
    private String idRegisterPatient;
    private String fristnameLastname;
    private String idCard;
    private String birthday;
    private String address;
    private String phone;
}
