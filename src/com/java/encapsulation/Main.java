package com.java.encapsulation;

public class Main {

	// Getters and setters help protect object data and add rules for accessing or
	// modifying them
	// Getters = Method that make a field readable.
	// Setters - method that make a field writable.
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Corolla", "black", 50000);
//		Car car1 = new Car(null, "Corolla", "black", 50000);
		Car car2 = new Car("Toyota", "Corolla", "blue", 9000);
		System.out.println(car1.getColor());
		System.out.println(car2.getColor());
		car2.setPrice(900);
		System.out.println(car2.getPrice());
		
	}
}
