package com.oops.org;
/*
 * jawad1992
 * version 1.8
 * here we are creating the instances
 */
public class AnimalRunner {

	public static void main(String[] args) {
		Animal animal=new Animal();
		Animal dog=new Dog();
		Animal pig=new Pig();
		
		animal.animalSound();
		dog.animalSound();
		pig.animalSound();
	}

}
