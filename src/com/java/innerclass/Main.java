package com.java.innerclass;

import com.java.innerclass.OuterClass.InnerNonStaticClass;
import com.java.innerclass.OuterClass.InnerStaticClass;

public class Main {

	public static void main(String[] argv) {
		OuterClass outer = new OuterClass();
		outer.heyThere();
		
		// need outer object to create object of non static inner class
		InnerNonStaticClass inner = outer.new InnerNonStaticClass();
		inner.hello();
		System.out.println(inner.number);
		
		// static inner class, direct access OuterClass as it's a member
		OuterClass.InnerStaticClass innerStatic = new InnerStaticClass();
		innerStatic.sayHello();

		System.out.println(OuterClass.num);
		System.out.println(outer.number);
		System.out.println(OuterClass.InnerStaticClass.num_);
	}

}
