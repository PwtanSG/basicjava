package com.java.composition;

public class Car {
	String model;
	int year;
	Engine engine;
	
	// engine object is "part of" Car class. 
	// note engine object is not pass in as arguement in the constuctor. 
	// engineType String is pass in and engine object is create in constructor in Car class
	Car(String model, int year, String engineTyoe){
		this.model = model;
		this.year = year;
		this.engine = new Engine(engineTyoe);
	}
	
	public void startEngine() {
		this.engine.start();
		System.out.println("you started the " + this.model + " car.");
	}
}
