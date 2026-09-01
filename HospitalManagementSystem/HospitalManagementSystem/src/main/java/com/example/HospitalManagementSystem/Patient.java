package com.example.HospitalManagementSystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {
    private int patientId;
    private String name;
    private String disease;
    private int age;
}
