package com.java.oop;

//static
//Makes a variable or method belong to the class rather than to any specific object
//commonly used for utility methods or shared resources

public class Friend {
	
	static int total = 0;
	String name;
	
	public Friend(String name) {
		this.name = name;
		total++;
	}
	
	
	public static void main(String[] args) {
		Friend friend1 = new Friend("David");
		Friend friend2 = new Friend("Dylan");
		System.out.println(total);
		System.out.println(friend1.name);
		System.out.println(friend2.name);
	}

}
