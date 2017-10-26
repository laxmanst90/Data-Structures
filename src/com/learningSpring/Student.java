package com.learningSpring;

public class Student {

	private String name;
	
	public void setName(String n){
		this.name=n;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void displayInfo(){
		
		System.out.println("Hello : "+name);
	}
	
}
