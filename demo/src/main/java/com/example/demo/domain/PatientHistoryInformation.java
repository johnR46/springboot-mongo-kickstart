package com.example.demo.domain;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class PatientHistoryInformation {
    @Id
    private String idPatientHistory;
    private String fristnameLastname;
    private String birthday;
    private String idCard;
    private String address;
    private String phone;
    private String healthInformation;
    private String travelInformation;
    private String careerInformation;
    private String assessmentResults;
}
