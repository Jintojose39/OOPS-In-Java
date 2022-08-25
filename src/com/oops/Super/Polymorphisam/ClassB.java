package com.oops.Super.Polymorphisam;

public class ClassB  extends ClassA{
	ClassB(){
		System.out.println("Its B constructer");
	}
	ClassB(int a){
		//to  calling the classA constructor here we using super().
		super(10);
		System.out.println("Its Argument Constructer of B");
	}
	int a;
	void display() {
		System.out.println("This is Sub Class B");
		//in  case of super is only call from sub class 
		//super.display();
		a=10;
		super.a=30;
		int c= a+super.a;
		System.out.println("The sum of the two numners is:"+ " "+c);
		
	}
	void basedisplay() {
		super.display();
	}

}
