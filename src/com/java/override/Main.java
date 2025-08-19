package com.java.override;

//method overriding
//when a subclass provides its own implementation of a method that is already defined.
//Allow the code re-usability and give specific implementation
//use @Override annotation with a upper case O, not mandatory but good practice and helps to spot typo

public class Main {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Fish fish = new Fish();
		
		dog.move();
		cat.move();
		// fish has a override method move
		fish.move();
		
		
		Car car = new Car("Kia", "Rio", 2006, "black");
		// showing the overriding toString method
		System.out.println(car);
		
	}

}
