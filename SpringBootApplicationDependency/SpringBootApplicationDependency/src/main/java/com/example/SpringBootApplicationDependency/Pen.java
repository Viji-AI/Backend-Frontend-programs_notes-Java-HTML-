package com.example.SpringBootApplicationDependency;

import org.springframework.stereotype.Component;

@Component
public class Pen {
    public void write() {

        System.out.println("Writing with pen");
    }
}
