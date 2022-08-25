package com.in.oops.AbstractMethod;

public class TextScanner {
	Hello obj;
	public TextScanner(Hello obj) {
		//here we set obj to global 
		this.obj=obj;
	}
	void scan() {
		obj.onText("Scanned Text");
		obj.onText("Scanned Tesxt 2");
	}

}
