package org.msankar.springtut.springaop.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Circle setter");
		this.name = name;
		throw(new RuntimeException());
	}
	
	public String setNameAndReturn(String name) {
		System.out.println("Circle setter");
		this.name = name;
		return "Very Fancy " + name;
	}
	
	public String getNameAndAround( ) {
		System.out.println("Circle getter");
		//throw(new RuntimeException());
		return "Very Fancy " + this.name;
	}
}
