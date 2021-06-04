package com.amad.creational_patterns.abstractfactorypattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type) {
		AbstractFactory abstractFactory;
		switch (type.toLowerCase()) {
		case "shape":
			abstractFactory = new ShapeFactory();
			break;
		case "color":
			abstractFactory = new ColorFactory();
			break;
		default:
			abstractFactory = null;
			break;
		}
		return abstractFactory;
	}
}
