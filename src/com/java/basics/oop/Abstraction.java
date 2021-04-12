package com.java.basics.oop;

/**
 * Abstraction: Concept of hiding data
 * @author Incognito
 */

public class Abstraction {
	// abstraction
	private int numOfEmployees = 0;

	public void setNoOfEmployees(int count) {
		numOfEmployees = count;
	}

	public double getNoOfEmployees() {
		return numOfEmployees;
	}

	public static void main(String[] args) {
		Example4 obj = new Example4();
		obj.display1();
	}
}

/**
 * Abstract Classes
 */
//abstract parent class
abstract class Creature {
	// abstract method
	public abstract void sound();
}

//Dog class extends Animal class
class Dog extends Creature {

	public void sound() {
		System.out.println("Woof");
	}
}

/**
 * Interface
 */
//first interface
interface Example1 {
	public void display1();
}

//second interface
interface Example2 {
	public void display2();
}

//This interface is extending both the above interfaces
interface Example3 extends Example1, Example2 {
}

class Example4 implements Example3 {
	public void display1() {
		System.out.println("display2 method");
	}

	public void display2() {
		System.out.println("display3 method");
	}
}
