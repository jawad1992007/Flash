package com.oops.org;
/*
 * jawad1992
 * Here we are implementing method overriding
 * using the parent class method in child class
 * 
 */
public class Animal {
	 public void animalSound() {
		    System.out.println("The animal makes a sound");
		  }
		}

		class Pig extends Animal {
		  public void animalSound() {
		    System.out.println("The pig says: wee wee");
		  }
		}

		class Dog extends Animal {
		  public void animalSound() {
		    System.out.println("The dog says: bow wow");
		  }
		}


