package com.codixlabs.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {

	static int version = 0;
	String name ;
	String color = "Red";
	
	@Autowired
	Machine machine;

	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Car() {
		name = "Q"+(++version);
		System.out.println("Instance Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void showCarDetails() {
		System.out.println("Name: " + name + " Color: " + color );
	}

}
