package com.bridge;

public class Square extends Shape{

	public Square(Color color) {
		super(color);
	}

	@Override
	void applyColor() {
		System.out.println("Square filled with ");
		color.applyColor();
		System.out.println("\n");
	}

}
