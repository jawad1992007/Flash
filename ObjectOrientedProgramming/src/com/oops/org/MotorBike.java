package com.oops.org;
/*
 * jawad1992
 * version 1.8
 * Here we are implementing Ecapsulation
 */
public class MotorBike {
	//declaring the instance variable as private
    private	int speed; 
	//using setters and getters methods to access and update the value of a private variable
       public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		
	}

	void start() {
    	   System.out.println("Bike started");
       }
}
