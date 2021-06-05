package com.amad.creational_patterns.singleton.eagerevaluation;

//Initializes at loading time itself even though client is not using it
public class Singleton {

	private Singleton() {
	}

	private static Singleton singleton = new Singleton();

	public static Singleton getInstance() {
		return singleton;
	}

	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Singleton [data=" + data + "]";
	}

}
