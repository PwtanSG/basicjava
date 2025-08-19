package com.java.superclass;

public class Student extends Person {

	double gpa;

	Student(String firstName, String lastName, double gpa) {
		super(firstName, lastName);
		this.gpa = gpa;
	}
	
	void showGpa() {
		System.out.println(this.firstName + " " + this.lastName + " GPA : " + this.gpa);
	}
}
