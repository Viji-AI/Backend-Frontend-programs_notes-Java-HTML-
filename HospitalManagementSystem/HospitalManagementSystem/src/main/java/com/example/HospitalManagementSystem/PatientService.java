package com.example.HospitalManagementSystem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PatientService {
    private List<Patient> patients = new ArrayList<>();
    public PatientService() {
        patients.add(new Patient(1, "Ravi", "Fever", 25));
        patients.add(new Patient(2, "Sita", "Cold", 30));
    }
    public List<Patient> getPatients() {
        return patients;
    }
    public Patient getPatientById(int id) {
        for (Patient p : patients) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        return null;
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public String updatePatient(Patient patient) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getPatientId() == patient.getPatientId()) {
                patients.set(i, patient);
                return "Patient updated";
            }
        }
        return "Patient not found";
    }
    public String deletePatient(int id) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getPatientId() == id) {
                patients.remove(i);
                return "Patient deleted";
            }
        }
        return "Patient not found";
    }

}
