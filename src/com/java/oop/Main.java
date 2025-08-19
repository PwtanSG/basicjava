package com.java.oop;

public class Main {

	// //class is a template for objects, and an object is an instance of a class.
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Corolla", 1985, "black", 50000.99);
		System.out.println(car1);
		car1.start();
		System.out.println(car1);
		car1.setYear(1986);
		car1.stop();
		System.out.println(car1);
		Car car2 = new Car("Toyota", "Camry", 1985, "White");
		System.out.println(car2);
		Car car3 = new Car("Kia", "Rio", 2006, "black");

		// array of objects
		Car[] cars = { car1, car2, car3 };
		// enhance for loop
		for (Car car : cars) {
			System.out.println(car.getMake() + " " + car.getModel() + " " + car.getColor());
		}
		// for loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].getModel());
		}
	}
}
