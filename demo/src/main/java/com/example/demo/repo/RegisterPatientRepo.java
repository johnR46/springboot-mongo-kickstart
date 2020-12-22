package com.example.demo.repo;

import com.example.demo.domain.RegisterPatient;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisterPatientRepo extends MongoRepository<RegisterPatient, String> {

}
