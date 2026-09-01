package com.example.HospitalManagementSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getPatients();
    }
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable int id) {
        return patientService.getPatientById(id);
    }
    @PostMapping
    public String addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
        return "Patient added";
    }
    @PutMapping
    public String updatePatient(@RequestBody Patient patient) {
        return patientService.updatePatient(patient);
    }
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable int id) {
        return patientService.deletePatient(id);
    }
}
