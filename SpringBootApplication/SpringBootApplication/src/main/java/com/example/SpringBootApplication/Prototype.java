package com.example.SpringBootApplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {
    int age;
    public void show(){
        System.out.println("Age is:"+ age);
    }
}

