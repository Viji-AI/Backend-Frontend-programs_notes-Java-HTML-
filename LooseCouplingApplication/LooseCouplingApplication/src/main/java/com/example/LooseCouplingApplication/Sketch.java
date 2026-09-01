package com.example.LooseCouplingApplication;

import org.springframework.stereotype.Component;

@Component
public class Sketch implements writertool{
    public void write(){
        System.out.println("Write using Sketch");
    }
}
