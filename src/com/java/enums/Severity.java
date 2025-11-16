package com.java.enums;

public enum Severity {

	// Enum constants (each has its own description)
	LOW("Low - minor issue that has little impact on the overall functionality"),
	MEDIUM("Medium - inconsistent system behavior but non-critical issues."),
	HIGH("High level - Affects a key functionality but the application is not broken."),
	SHOWSTOPPER("ShowStopper - Renders the application unusable or causes a complete crash.");

	// Field (variable) to store the description text
	private String descriptions;
	
	Severity(String descriptions) {
		this.descriptions = descriptions;
	}
	
	// getter for descriptions
	public String getDescriptions() {
		return descriptions;
	}
}
