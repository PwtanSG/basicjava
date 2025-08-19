package com.java.oop;

/**
 * https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=24107s
 */
public class Car {

	// attributes
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;
	private boolean isRunning;

	// constructor is a special method to initialize objects. you can pass arguments to constructor or set up initial values.
	public Car(String make, String model, int year, String color, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.isRunning = false;
	}
	
	public Car(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.isRunning = false;
	}

	// getter and setters - accessor and mutator methods
	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean getIsRunning() {
		return this.isRunning;
	}
	

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + ", price=" + price
				+ ", isRunning=" + isRunning + "]";
	}

	public void start() {
		this.isRunning = true;
		System.out.println("Start Engine");
	}

	public void stop( ) {
		this.isRunning = false;
		System.out.println("Stop Engine");
	}
}