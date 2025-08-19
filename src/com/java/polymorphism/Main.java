package com.java.polymorphism;

public class Main {

	public static void main(String[] args) {

		// Polymorphism
		// "POLY" = "Many"
		// "MORPH" = "SHAPE"
		// Objects can identify as other objects
		// objects can be treated as objects of a common superclass

		Car car = new Car();
		Bike bike = new Bike();
		Boat boat = new Boat();

		Vehicle[] vehicles = { car, bike, boat };

		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].go();
		}

		for (Vehicle vehicle : vehicles) {
			vehicle.go();
		}
	}
}
