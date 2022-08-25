package com.inoops.Inheritence;

public class ClassRunner {

	public static void main(String[] args) {
		ClassB b=new ClassB();
		ClassA a=new ClassA();
		//so we get the combined output of Class A and Class B.
		b.displayB();
		b.display();
		b.showB();//the number is 10
		a.showA();//the number is 15
		b.showA();//the number is 15
		
	}

}
