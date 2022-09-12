package com.prowings.oops.abstraction;

public abstract class AbstractClassDemo {
	int i, j;
	String s1, s2;

	AbstractClassDemo() {													// all arg constructor of parent
		System.out.println("\n\nno arg constructor of parent");
	}

	AbstractClassDemo(int i, int j, String s1, String s2) {					// all arg constructor of parent
		this.i = i;
		this.j = j;
		this.s1 = s1;
		this.s2 = s2;
		System.out.println("all arg constructor of parent");
	}

	void print() { 															// Concrete method
		System.out.println("inside print method");
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.s1);
		System.out.println(this.s2);
	}

	public abstract void show(); 											// abstract method

}
