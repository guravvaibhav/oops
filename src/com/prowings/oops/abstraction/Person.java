package com.prowings.oops.abstraction;

public  class Person {
	String nm;
	int age;
	Person(String nm,int age){
		this.nm=nm;
		this.age=age;
	}
	void print() {
		System.out.println("name is : "+nm);
		System.out.println("age is : "+age);
	}

}
