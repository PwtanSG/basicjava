package com.java.enums;

public enum Day {
	
	// enum constants
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private final int dayNum;
	
	// enum constructor
	Day(int dayNum) {
		this.dayNum = dayNum;
	}
	
	//getter method
	public int getDay() {
		return this.dayNum;
	}
}
