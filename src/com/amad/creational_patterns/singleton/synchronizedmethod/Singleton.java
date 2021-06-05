package com.amad.creational_patterns.singleton.synchronizedmethod;

//thread safe but due to synchronization hit performance 
public class Singleton {



	private Singleton() {
	}

	private static Singleton singleton = null;
	
	public static synchronized Singleton getInstance() {
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
