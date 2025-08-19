package com.java.abstraction;

public abstract class Shape {

	// abstract method - method body must be empty, details to be implemented by child class
	abstract double area();
	
	// concrete method
	void display() {
		System.out.println("this is a shape");
	}
}
