package com.java.innerclass;

// https://www.youtube.com/watch?v=_kjKN6zjVU4
public class OuterClass {

	static int num = 8;
	int number = 9;


	public void heyThere() {
		PrivateInnerClass privateInnerClass = new PrivateInnerClass();
		System.out.println("Outer Class hey there! " + number + privateInnerClass.no);
	}

	// inner class residing inside the outerclass
	public class InnerNonStaticClass {

		int number = 10;

		public void hello() {
			System.out.println("hello from inner class! " + number);
		}
	}

	public static class InnerStaticClass {

		static int num_ = 7;
		int number = 11;

		public void sayHello() {
			System.out.println("Say hello from inner static! " + number);
		}
	}
	
	// an inner class can be private or protected. If you don't want outside objects to 
	// access the inner class, declare the class as private:
	private class PrivateInnerClass {
		private int no = 5;
	}

}
