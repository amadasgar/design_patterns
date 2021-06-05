package com.amad.creational_patterns.builderpattern;

public interface BuilderInterface {

	void buildBody();

	void insertWheels();

	void addHeadlight();

	Product getVehicle();
}

class Car implements BuilderInterface {
 
	Product product = new Product();
	
	@Override
	public void buildBody() {
		System.out.println("Building Car Body");
		product.add("Building Body");
	}

	@Override
	public void insertWheels() {
		System.out.println("Adding 4 Wheels");
		product.add("Adding 4 Wheels");
	}

	@Override
	public void addHeadlight() {
		System.out.println("Adding 2 Headlight");
		product.add("Adding 2 Headlight");
	}

	@Override
	public Product getVehicle() {
		return product;
	}
}

class MotorVehicle implements BuilderInterface {
	 
	Product product = new Product();
	
	@Override
	public void buildBody() {
		System.out.println("Building Motor Body");
		product.add("Building Body");
	}

	@Override
	public void insertWheels() {
		System.out.println("Adding 2 Wheels");
		product.add("Adding 2 Wheels");
	}

	@Override
	public void addHeadlight() {
		System.out.println("Adding 1 Headlight");
		product.add("Adding 1 Headlight");
	}

	@Override
	public Product getVehicle() {
		return product;
	}
}
