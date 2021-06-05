package com.amad.creational_patterns.singleton.doublechecklocking;

//thread safe and synchronization will happen only once will not be bottle neck 
public class Singleton {

	private Singleton() {
	}

	private volatile static Singleton singleton = null;

	public static Singleton getInstance() {

		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
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
