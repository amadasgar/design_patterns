package com.amad.structural_patterns.adapter.classinheritance;

public class Client {

	public static void main(String[] args) {
		System.out.println("Class And ObjectAdapter Demo");
		ClassAdapter classAdapter = new ClassAdapter();
		System.out.println("Class Adapter Is Returning: " + classAdapter.getInteger());

		ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
		System.out.println("Object Adapter Is Returning: " + objectAdapter.getInteger());
	}
}
