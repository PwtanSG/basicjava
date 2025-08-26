package com.java.arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> foods = new ArrayList<>();

		System.out.print("Enter the number food you would like : ");
		int numOfFood = scanner.nextInt();
		scanner.nextLine(); // to remove the extra char left - see below
		
		for (int i = 1; i <= numOfFood ; i++) {
			System.out.print("Enter the #" + i + " food : ");
			String food = scanner.nextLine();
			foods.add(food);
		}
		
		System.out.println("The food list are :");
		for (String food : foods) {
			System.out.println(food);
		}
		
		scanner.close();
	}
}

// Important Note: When mixing nextLine() with other next methods (like nextInt(), nextDouble()), it's common to encounter
// an issue where nextLine() reads an empty string. This happens because nextInt() (and similar methods) do not consume 
// the newline character left in the input buffer after the user presses Enter. To resolve this, 
// an extra scanner.nextLine() call is needed to consume this leftover newline before the next intended nextLine() call. 
