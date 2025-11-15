package com.java.anonymous;

// https://www.w3schools.com/java/java_anonymous.asp

public class Main {
	public static void main(String[] args) {
		
		Animal anm = new Animal() {
			@Override
			public void makeSound() {
				System.out.println("Anonymous sound");
			}
		};
		anm.makeSound();
		
		Greeting greet = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hi Anonymous.");
			}
		};
		greet.sayHello();
		
	}
}