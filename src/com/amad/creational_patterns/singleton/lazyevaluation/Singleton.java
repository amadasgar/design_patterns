package com.amad.creational_patterns.singleton.lazyevaluation;

//Not thread safe
public class Singleton {

	private Singleton() {
	}

	private static Singleton singleton = null;
	
	public static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
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
