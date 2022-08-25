package com.oopsconcept.thiskeyword;

public class Sample1 {
	//global variable
	int a=20;
	int b=30;
	
	Sample1(int a,int b){
		//to calling a,b we use this.a and this.b
		this.b=b;
		this.a=a;
		int sum=a+b;
		int mult=a*b;
		int sub=a-b;
		System.out.println("The two numbers are:"+" "+a+","+b);
		System.out.println("The Sum of  these numbers is:"+" "+sum);
		System.out.println("The Multplication between these numbers is:"+" "+mult);
		System.out.println("The Substraction of these numbers is:"+" "+sub);
	}

}
