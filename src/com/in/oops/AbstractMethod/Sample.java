package com.in.oops.AbstractMethod;

public class 
//here we inherit the abstract class hello to class Sample.
Sample extends Hello {

	@Override
	void onText(String text) {
		System.out.println(text);
	
	}
	Sample(){
		TextScanner ts=new TextScanner(this);
		ts.scan();
	}
}
