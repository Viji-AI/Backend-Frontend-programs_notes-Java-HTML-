package com.example.LooseCouplingApplication;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements writertool{
    public void write(){
        System.out.println("Write using pencil");
    }
}
