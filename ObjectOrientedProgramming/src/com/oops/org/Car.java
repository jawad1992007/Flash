package com.oops.org;

public class Car extends Vehicle {
	private String modelName="mustang";

	public static void main(String[] args) {
		Car car=new Car();
		car.honk();
		
		
		System.out.println(car.modelName + " " + car.brand);
	}

}
