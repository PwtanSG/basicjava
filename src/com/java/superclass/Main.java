package com.java.superclass;

/**
 * https://youtu.be/xTtL8E4LzTQ?t=27114
 * super - refers to the parent class(subclass <- superclass)
 * Used in constructors and method overriding
 * calls the parent constructor to initialize attributes
 */

public class Main {
	public static void main(String[] args) {

		Person person = new Person("Lars", "Urlich");
		person.showName();
		
		Student student = new Student("James", "Wong", 3.21);
		student.showGpa();
		
		Employee employee = new Employee("Wang", "Qiang", 5000);
		employee.showName();
		employee.showSalary();
		
	}
}
