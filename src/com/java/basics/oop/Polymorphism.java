package com.java.basics.oop;

/**
 * Polymorphism is the capability of a method to do different things based on
 * the object that it is acting upon. Method Overloading and Method overriding
 * 
 * @author Incognito
 */

public class Polymorphism {
	public static void main(String args[]) {
		Animal obj = new Horse();
		obj.sound();
	}
}

class Animal {
	/**
	 * method overloading
	 */
	void overload(int a) {
		System.out.println("a: " + a);
	}

	void overload(int a, int b) {
		System.out.println("a and b: " + a + "," + b);
	}

	public void sound() {
		System.out.println("Animal is making a sound");
	}
}

class Horse extends Animal {
	/**
	 * Method Overriding
	 */
	@Override
	public void sound() {
		System.out.println("Neigh");
	}
}
