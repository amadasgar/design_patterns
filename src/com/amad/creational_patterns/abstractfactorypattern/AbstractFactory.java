package com.amad.creational_patterns.abstractfactorypattern;

public abstract class AbstractFactory {

	abstract Shape getShape(String type);

	abstract Color getColor(String type);
}

class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String type) {

		if (type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (type.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else {
			return null;
		}

	}

	@Override
	Color getColor(String type) {
		return null;
	}

}

class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String type) {

		if (type.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (type.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (type.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else {
			return null;
		}

	}

	@Override
	Shape getShape(String type) {
		return null;
	}

}