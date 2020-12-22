package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.RegisterPatient;
import com.example.demo.repo.RegisterPatientRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register-patient")
public class RegisterPatientRest {

    @Autowired
    private RegisterPatientRepo registerRepo;

    @GetMapping("/find-all")
    public ResponseEntity<?> getRegisterPatients() {
        List<RegisterPatient> registerList = registerRepo.findAll();
        return ResponseEntity.ok(registerList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRegisterPatient(@PathVariable String id) {
        Optional<?> register = registerRepo.findById(id);
        if (!register.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(register);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createRegisterPatient(@RequestBody RegisterPatient body) {
        RegisterPatient register = this.registerRepo.save(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(register);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRegisterPatient(@PathVariable String id, @RequestBody RegisterPatient body) {
        Optional<RegisterPatient> registerPatientOpt = this.registerRepo.findById(id);
        if (!registerPatientOpt.isPresent()) {
            return ResponseEntity.ok(registerPatientOpt);
        }
        body.setIdRegisterPatient(id);
        Optional.of(this.registerRepo.save(body));
        return ResponseEntity.ok(body);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRegisterPatient(@PathVariable String id) {
        if (!deleteById(id)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

    public boolean deleteById(String id) {
        try {
            this.registerRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
