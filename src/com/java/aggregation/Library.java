package com.java.aggregation;

public class Library {
	
	String name;
	int year;
	Book[] books; 	// array of book objects
	
	public Library(String name, int year, Book[] books) {
		this.name = name;
		this.year = year;
		this.books = books;
	}
	
	void displayInfo() {
		System.out.println(this.name + " " + this.year);
		for (Book book : books) {
			System.out.println(book.title);
		}
		
	}
	
}
