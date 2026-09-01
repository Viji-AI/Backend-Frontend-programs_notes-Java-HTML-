package com.example.BioDatalManagementSystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BioData {
    private int personId;
    private String name;
    private String gender;
    private int age;
}
