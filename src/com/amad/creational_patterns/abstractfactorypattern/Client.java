package com.amad.creational_patterns.abstractfactorypattern;

public class Client {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");

		Shape rectangle = shapeFactory.getShape("rectangle");
		Shape square = shapeFactory.getShape("square");
		Shape circle = shapeFactory.getShape("circle");

		rectangle.draw();
		square.draw();
		circle.draw();
		
		Color red = colorFactory.getColor("RED");
		Color green = colorFactory.getColor("GREEN");
		Color blue = colorFactory.getColor("BLUE");
		
		red.fill();
		green.fill();
		blue.fill();
	}
}
