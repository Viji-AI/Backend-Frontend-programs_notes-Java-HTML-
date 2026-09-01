package com.example.LooseCouplingApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    public Student(@Qualifier("sketch") writertool tool){
        this.tool=tool;
    }
    private writertool tool;
    public void writerExam(){
        System.out.println("Student is writing exam");
        tool.write();
    }


}
