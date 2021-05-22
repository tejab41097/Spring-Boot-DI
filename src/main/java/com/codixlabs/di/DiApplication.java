package com.codixlabs.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DiApplication.class, args);
		Car audi = context.getBean(Car.class);
		audi.showCarDetails();
		
		Car audi2 = context.getBean(Car.class);
		audi2.showCarDetails();
		
		Car audi3 = context.getBean(Car.class);
		audi3.showCarDetails();
	}

}
