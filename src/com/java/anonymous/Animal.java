package com.java.anonymous;

public class Animal {

	public void makeSound() {
		System.out.println("make sound");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("testing");
		Animal animal = new Animal();
		animal.makeSound();
		
		Animal animal1= new Animal() {
			@Override
			public void makeSound() {
				System.out.println("woof1");				
			}
		};		
		animal1.makeSound();
	}

}
