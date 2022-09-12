package com.prowings.oops.abstraction;

public class Teacher extends Person {
	String sub;
	Teacher(String nm,int age,String sub){
		super(nm,age);
		this.sub=sub;
	}
	public static void main(String[] args) {
		Teacher t=new Teacher("sham",23,"maths");
		t.print();
		System.out.println("subject is : "+t.sub);
	}

}
