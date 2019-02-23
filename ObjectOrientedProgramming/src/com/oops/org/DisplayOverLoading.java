package com.oops.org;
/*
 * jawad1992
 * version
 */
public class DisplayOverLoading {
	//creating a method display and passing one parameter
	public void display(char c) {  
		System.out.println(c);   
	}
	//using same method name and passing two parameters
	public void display(char c , int num) {
		System.out.println(c + " "+ num);
	}
	}

