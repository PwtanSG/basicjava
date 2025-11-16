package com.java.strings;

public class SpecialStringsObjects {
	// https://www.w3schools.com/java/java_strings.asp
	// A String in Java is not a primitive data type. Itis actually an object,
	// it contains methods that can perform certain operations on strings.
	// A String variable contains a collection of characters surrounded by double
	// quotes (""):
	public static void main(String[] args) {

		// The backslash (\) escape character turns special characters into string
		// characters:
		String txt1 = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt1);
		// We are the so-called "Vikings" from the north.

		String txt2 = "It\'s alright.";
		System.out.println(txt2);
		// It's alright.

		String txt3 = "The character \\ is called backslash.";
		System.out.println(txt3);
		// The character \ is called backslash.
	}
}
