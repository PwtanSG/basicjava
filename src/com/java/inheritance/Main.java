package com.java.inheritance;

/**
 * https://www.youtube.com/watch?v=xTtL8E4LzTQ&t=28318s Inheritance - one class
 * inherits the attributes and methods from another class 
 * Child <-- Parent<--GrandParent
 * use extends keyword
 */
public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();

		System.out.println("Dog isAlive :" + dog.isAlive);
		System.out.println("Cat isAlive :" + cat.isAlive);
		dog.eat();
		cat.eat();
		
		System.out.println(cat.lives);
		System.out.println(dog.lives);
		cat.speak();
		dog.speak();
		
		Plant plant = new Plant();
		plant.photosynthesize();
		System.out.println("isAlive: " + plant.isAlive);

	}
}
