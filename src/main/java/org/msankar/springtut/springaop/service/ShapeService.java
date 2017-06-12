package org.msankar.springtut.springaop.service;

import org.msankar.springtut.springaop.aspect.Loggable;
import org.msankar.springtut.springaop.model.Circle;
import org.msankar.springtut.springaop.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;

	@Loggable
	public Circle getCircle() {
		System.out.println("Circle getter");
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Triangle getTriangle() {
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
