package com.java.superclass;

public class Employee extends Person {

	int salary;

	public Employee(String firstName, String lastName, int salary) {
		super(firstName, lastName);
		this.salary = salary;
	}
	
	void showSalary() {
		System.out.println(this.firstName + " " + this.lastName + ":" + this.salary );
	}
}
