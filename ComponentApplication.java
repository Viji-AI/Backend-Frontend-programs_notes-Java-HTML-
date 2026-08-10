package com.example.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(ComponentApplication.class, args);
		example_component com = context.getBean(example_component.class);
		com.display();
		Component_1 com1 = context.getBean(Component_1.class);
		com1.view();

	}

}
