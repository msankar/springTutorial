package org.msankar.springtut.springdemo;

public class AutowireTriangle {
	@Override
	public String toString() {
		return "AutowireTriangle [pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}

	private Point pointA;
	private Point pointB;
	private Point pointC;
		
	public void draw() {
		System.out.println(this);
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
}