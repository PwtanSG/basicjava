package com.java.abstraction;

public class Circle extends Shape {

	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * this.radius * this.radius;
	}

}
