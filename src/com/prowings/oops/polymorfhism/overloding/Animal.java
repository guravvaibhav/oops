package com.prowings.oops.polymorfhism.overloding;

public class Animal {
	int i=10;
	public static void main(String[] args) {
		Monkey m=new Monkey();
		Animal a=new Animal();
//		m.m1(a);
	}
	@Override
	public String toString() {
		return "Animal [i=" + i + "]";
	}
	
}
