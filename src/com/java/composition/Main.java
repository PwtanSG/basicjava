package com.java.composition;

public class Main {
//	composition 
//	represents a "part-of" relationship between objects
//	for exampl, an engine is "part of" a Car.
//	allows complex objects to be constructed from smaller objects
	public static void main(String[] args) {
		Car car = new Car("Suzuki Swift GTi", 2003, "1.3L DOHC");
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.engine);
		System.out.println(car.engine.type);
		car.startEngine();
	}
}
