package com.java.aggregation;

//Aggregation 
//Represent a "has-a" relationship between objects. 
//one object contains another object as part of its structure,
//but the contained object/s can exist independently.

public class Main {
	public static void main(String[] args) {
		// library and book objects can exist independently
		//
		Book book1 = new Book("The fellowship of the ring", 423);
		Book book2 = new Book("The Two", 213);
		Book book3 = new Book("The Lord", 1423);

		Book[] books = { book1, book2, book3 };

		for (Book book : books) {
			System.out.println(book.title);
		}

		Library library = new Library("Toa payoh library", 1973, books);
		library.displayInfo();

	}
}
