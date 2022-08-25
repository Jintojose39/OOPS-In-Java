package com.oops.polymorphisam.methodoverloading;

public class Hello {
	void display() {
		System.out.println("Welcome to Overloading Method");
		
	}
	void display(int a) {
		System.out.println("The number is:"+" "+a);
		
	}
	void display(float b) {
		System.out.println("The another number is:"+b);
	}
	
}
