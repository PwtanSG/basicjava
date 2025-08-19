package com.java.polymorphism.runtime;

import java.util.Scanner;

public class Main {
	// Runtime polymorphism
	// when the method that gets executed is decided at runtime based on the actual
	// type of object
	public static void main(String[] args) {
		Animal animal;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter 1 for Dog or 2 for Cat : ");
			int choice = scanner.nextInt();

			if (choice == 1) {
				animal = new Dog();
				animal.speak();
			} else if (choice == 2) {
				animal = new Cat();
				animal.speak();
			}
		}
	}
}


//Use try-with-resources to avoid "Resource leak: 'scanner' is never closed"