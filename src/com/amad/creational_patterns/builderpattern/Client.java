package com.amad.creational_patterns.builderpattern;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		BuilderInterface carBuilder = new Car();
		BuilderInterface motorBuilder = new MotorVehicle();

		director.construct(carBuilder);
		Product product = carBuilder.getVehicle();

		director.construct(motorBuilder);
		Product mProduct = motorBuilder.getVehicle();

		product.show();
		mProduct.show();
	}
}
