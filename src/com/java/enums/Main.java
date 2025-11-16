package com.java.enums;

public class Main {
	
	// Type Safety: Enums ensure that a variable can only hold one of the predefined, 
	// valid enum constants, preventing the assignment of arbitrary or incorrect values. 
	// This reduces runtime errors and improves code robustness.

	public static void main(String[] argv) {
		
		enum Level{
			LOW,
			MEDIUM,
			HIGH
		}
		Level myLevel = Level.LOW;
		System.out.println(myLevel);
		
		String message = "";
		Day day = Day.WEDNESDAY;
		
		switch(day) {
			case MONDAY,
				TUESDAY, 
				WEDNESDAY, 
				THURSDAY,
				FRIDAY -> message = "it's a weekday";
			case SATURDAY, SUNDAY -> message = "it's a weekend";
		}
		
		System.out.println(message);
		System.out.println(day.getDay());
		
		Severity severity = Severity.MEDIUM;
		System.out.println(severity.getDescriptions());
	}
}
