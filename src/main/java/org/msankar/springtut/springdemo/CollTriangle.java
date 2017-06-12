package org.msankar.springtut.springdemo;

import java.util.List;

public class CollTriangle {
	
	private List<Point> points;
		
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "CollTriangle [points=" + points + "]";
	}
}
