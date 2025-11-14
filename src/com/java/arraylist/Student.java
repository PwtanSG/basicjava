package com.java.arraylist;

public class Student {
	
	// attribute
	public String name;
	public String id;
	public double gpa;
	
	// constructor
	public Student(String name, String id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	public String info() {
		return "name: " + name + ", ID: " + id + ", GPA: " + gpa + "\n";
	}
}
