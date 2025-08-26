package com.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
//		Arraylist
//		A resizable array that stores objects (autoboxing).
//		Arrays are fixed in use but Arraylists can change. they are dynamic
//		import java.util.ArrayList;
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		you need the diamond operator to define type of object to be stored in the ArrayList 
//		however the right side bracket can be left empty as Java will inferred
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(7);
		list.add(9);
		System.out.println(list);
		
		ArrayList<Double> dlist = new ArrayList<>();
		dlist.add(3.14);
		dlist.add(1.72);
		dlist.add(0.68);
		System.out.println(dlist);
		
		ArrayList<String> fruits = new ArrayList<>();
		// ArrayList add method
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("blueberries");
		System.out.println(fruits);
		
		// sorting ArrayList !impt case sensitive
		System.out.println("Sort: ");
		Collections.sort(fruits);
		System.out.println(fruits);
		
		// size method
		System.out.println(fruits.size());
		
		// loop thru using enhance for loop
		// note the datatype for the ArrayList is the tyoe specified
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
		//.set method will replace the index value
		fruits.set(1, "Watermelon");
		System.out.println(fruits);
		
		// remove method
		fruits.remove(1);
		System.out.println(fruits);
		
		// get method
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
	}
}