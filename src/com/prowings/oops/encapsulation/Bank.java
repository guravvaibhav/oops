package com.prowings.oops.encapsulation;

import java.util.Scanner;

public class Bank {
	private double bal=10000;
	private String nomee="ram";
	Scanner sc=new Scanner (System.in);
	double getBalance() {
		
		System.out.println("enter pin");
		int pin=sc.nextInt();				
		if(pin==123) 
			return bal;
		else 
		return -23;
	}
	String getNomee() {
		System.out.println("enter pin");
		int pin=sc.nextInt();
		if(pin==123)
			return nomee;
		else
			return "incorrect pin";
	}
	void setBalance() {
		System.out.println("enter amount");
		
		double amt=sc.nextDouble();
		this.bal=bal-amt;
		
	}
}
