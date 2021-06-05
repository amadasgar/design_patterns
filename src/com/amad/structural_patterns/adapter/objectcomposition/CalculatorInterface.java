package com.amad.structural_patterns.adapter.objectcomposition;

public interface CalculatorInterface {

	public double getArea(Rectangle rectangle);
}

class Rectangle {

	double length;
	double width;

	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
}

class Triangle {
	double base;
	double height;

	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
}


class Calculator implements CalculatorInterface {

	Rectangle rectangle;
	
	@Override
	public double getArea(Rectangle r) {
		this.rectangle = r;
		return rectangle.length * rectangle.width;
	}
	
}