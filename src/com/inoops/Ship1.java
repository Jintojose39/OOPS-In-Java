package com.inoops;

public class Ship1 {
	private int speed;
	
	public Ship1(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	void ship1On() {
		System.out.println("Ship 1 engine is Ready for Start");
		
	}

}
