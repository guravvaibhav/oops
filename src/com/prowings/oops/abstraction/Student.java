package com.prowings.oops.abstraction;

public class Student extends Person{
	int roll;
	Student(String nm,int age,int roll){
		super(nm,age);
		this.roll=roll;
	}
	public static void main(String[] args) {
		
		Student s=new Student("ram",20,101);
		s.print();
		System.out.println("roll number is : "+s.roll);
	}
}
