package com.bridge;

//Shape hierarchy

public abstract class Shape {
	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract void applyColor();
}
