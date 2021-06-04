package com.amad.creational_patterns.factorymethod.staticmethod;

public class ShapeFactory {

	public static Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else {
			return null;
		}
	}
}
