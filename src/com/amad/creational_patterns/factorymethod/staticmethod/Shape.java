package com.amad.creational_patterns.factorymethod.staticmethod;

public interface Shape {

	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() menthod");
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() menthod");
	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() menthod");
	}

}

