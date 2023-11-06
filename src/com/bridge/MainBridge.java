package com.bridge;

public class MainBridge {

	public static void main(String[] args) {
		Color red = new Red();
		Color blue = new Blue();
		
		Shape redCircle = new Circle(red);
		Shape blueSquare = new Square(blue);
		
		redCircle.applyColor();
		blueSquare.applyColor();
	}

}
