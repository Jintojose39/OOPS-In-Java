package com.inoops;
public class HelloRunner {
	int a=10;
	//here we consider static b so it can only access static method
	static int b=20;
	public static void main(String[] args) {
		//int a=1;
		HelloRunner h=new HelloRunner();
		HelloRunner h1=new HelloRunner();
		System.out.println(h.a);
		System.out.println("h.b"+h.b);
		h.hello();
		h.a=100;
		h.b=50;
		h1.b=100;
		//in case of we use static variable so the output will considered as 
		//the last assigned value for that variable.
		b=2500;
		System.out.println(h.a);
		
	}
	void hello() {
		
	}
	static void hey() {

}
}
