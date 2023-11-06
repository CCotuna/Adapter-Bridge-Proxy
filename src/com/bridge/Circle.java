package com.bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	void applyColor() {
		System.out.println("Circle filled with ");
		color.applyColor();
		System.out.println("\n");
	}

}
