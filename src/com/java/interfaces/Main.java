package com.java.interfaces;

public class Main {
	
//	Interface
//	A blueprint for a class that specifies a set of abstract methods that implementing classes must define.
//	With interface allow support of multiple inheritance-like behaviour
//	child use implements keyword to implement interfaces

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		hawk.hunt();
		rabbit.flee();
	}
}
