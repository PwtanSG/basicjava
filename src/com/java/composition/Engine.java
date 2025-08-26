package com.java.composition;

public class Engine {
	
	String type;

	public Engine(String type) {
		this.type = type;
	}

	void start() {
		System.out.println("you started the " + this.type + " engine.");
	}
}
