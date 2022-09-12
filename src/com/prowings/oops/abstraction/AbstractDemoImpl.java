package com.prowings.oops.abstraction;

public class AbstractDemoImpl extends AbstractClassDemo {
	AbstractDemoImpl() {
		System.out.println("no arg constructor of child");
	}

	AbstractDemoImpl(int i, int j, String s1, String s2) {
		super(i, j, s1, s2);
		System.out.println("All arg constructor of child");
	}

	public void show() {
		System.out.println("in side show method");
	}

	public static void main(String[] args) {
		AbstractDemoImpl obj = new AbstractDemoImpl(10, 20, "ram", "sham");
		obj.print();
		obj.show();
		AbstractDemoImpl obj2 = new AbstractDemoImpl();
		obj2.print();
		obj2.show();
	}
}
