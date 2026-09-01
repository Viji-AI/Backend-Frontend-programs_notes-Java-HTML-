package com.example.SpringBootApplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Singleton {
    int age;
    public void show(){
        System.out.println("Age is : "+ age);
    }
}
