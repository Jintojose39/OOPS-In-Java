package com.inoops;

public class ShipRunner {
	static int  speed =450;
	
	
	

	public static void main(String[] args) {
		Ship1 ship1=new Ship1(45);
		ship1.ship1On();
		Ship2 ship2=new Ship2();
		Ship3 ship3=new Ship3();
		ship2.ship2On();
		ship1.setSpeed(45);
		System.out.println(ship1);
		ship1.setSpeed(46);
		System.out.println("The Starting Speed of the Ship 1 is"+" " +speed);
		ship2.ship2On();
		ship3.ship3On();
		
		
		

	}	
}
