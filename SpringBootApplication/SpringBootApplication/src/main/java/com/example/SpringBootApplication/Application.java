package com.example.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Singleton s1 = context.getBean(Singleton.class);
		s1.age = 22;
		Singleton s2 = context.getBean(Singleton.class);
		s2.age = 23;
		System.out.println("First Value:"+ s1.age);
		System.out.println("Second Value:"+ s2.age);
		Prototype p1 = context.getBean(Prototype.class);
		p1.age = 22;
		Prototype p2 = context.getBean(Prototype.class);
		p2.age = 23;
		System.out.println("First Value:"+ p1.age);
		System.out.println("Second Value:"+ p2.age);

	}

}
