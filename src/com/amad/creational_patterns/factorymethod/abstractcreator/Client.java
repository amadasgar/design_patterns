package com.amad.creational_patterns.factorymethod.abstractcreator;

public class Client {

	public static void main(String[] args) {

		Shape rectangle = new RectangleFactory().getShape();
		Shape square = new SquareFactory().getShape();
		Shape circle = new CircleFactory().getShape();

		rectangle.draw();
		square.draw();
		circle.draw();
	}
}
