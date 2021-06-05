package com.amad.creational_patterns.singleton.billpugh;

//Recommended uses static inner class
public class Singleton {

	private Singleton() {
	}

	// nested
	private static class SingletonHelper {
		// nested class is referenced after get instance is called
		private static final Singleton uniqueInstance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHelper.uniqueInstance;
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
