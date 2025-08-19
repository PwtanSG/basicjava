package com.java.abstraction;

public class Main {
	
//	abstract
//	use to define abstract classes and methods
//	Abstraction is the process of hiding implementation details and showing only the essential features
//	Abstract classes CANNOT be instantiated directly
//	Can contain 'abstract' methods (which must be implemented)
//	Can contain 'concrete' methods (which are inherited)
	public static void main(String[] args) {

		Circle circle = new Circle(2);
		Triangle triangle = new Triangle(4, 5);
		Rectangle rectangle = new Rectangle(4,5);
		
		// concrete method are implemented in the abstract class and inherited by child class
		circle.display();
		triangle.display();
		rectangle.display();

		// abstract method are implemented in the child class
		System.out.println(circle.area());
		System.out.println(rectangle.area());
		System.out.println(triangle.area());
	}
	
}
