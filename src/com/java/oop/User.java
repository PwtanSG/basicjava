package com.java.oop;

// overloading constructors
//https://youtu.be/xTtL8E4LzTQ?t=25320

public class User {

	String username;
	String email;
	int age;

	// overloading constructor
	User(String username) {
		this.username = username;
	}

	User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	User(String username, String email, int age) {
		this.username = username;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		User user1 = new User("Jameshetfield");
		User user2 = new User("john", "johndoe@yahoo.com");
		User user3 = new User("Johnny", "johnny@gmail.com", 45);

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);

//		output
//		User [username=Jameshetfield, email=null, age=0]
//		User [username=john, email=johndoe@yahoo.com, age=0]
//		User [username=Johnny, email=johnny@gmail.com, age=45]
	}

}
