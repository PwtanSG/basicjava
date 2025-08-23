package com.java.encapsulation;

public class Car {

	private String make;
	private String model;
	private String color;
	private int price;

	Car(String make, String model, String color, int price) {
		validateCarArguments(make, model, color, price);
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;

	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			throw new IllegalArgumentException("price cannot be less than 0");
		}
		this.price = price;
	}

	private void validateCarArguments(String make, String model, String color, int price) {
		if (make == null || make.trim().isEmpty()) {
			throw new IllegalArgumentException("make is required");
		}

		if (model == null || model.trim().isEmpty()) {
			throw new IllegalArgumentException("model is required");
		}

		if (color == null || color.trim().isEmpty()) {
			throw new IllegalArgumentException("model is required");
		}

		if (price < 0) {
			throw new IllegalArgumentException("price cannot be less than 0");
		}
	}

}
