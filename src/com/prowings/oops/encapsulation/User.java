package com.prowings.oops.encapsulation;

public class User extends Bank {
	public static void main(String[] args) {
		User u=new User();
		double b=u.getBalance();
		if(b>0)
		System.out.println(b);
		else
			System.out.println("incorrect pin");
		u.getNomee();
		u.setBalance();
		
		System.out.println(u.getBalance());
	}

}
