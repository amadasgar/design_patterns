package com.amad.creational_patterns.singleton.billpugh;

public class Client {


	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.setData(10);
		System.out.println(singleton);

		singleton = null;
		singleton = Singleton.getInstance();
		System.out.println(singleton);
	}


}
