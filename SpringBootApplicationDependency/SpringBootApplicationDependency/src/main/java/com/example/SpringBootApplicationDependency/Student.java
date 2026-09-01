package com.example.SpringBootApplicationDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Pen pen;
    public void setPen(Pen pen) {
        this.pen = pen;
    }
    public Student( Pen pen ){
        this.pen = pen;
    }
    @Autowired
    public void writeExam() {
        System.out.println("Student is writing exam");
        pen.write(); }
}
