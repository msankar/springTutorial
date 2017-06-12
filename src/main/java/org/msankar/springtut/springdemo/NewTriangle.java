package org.msankar.springtut.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NewTriangle implements InitializingBean, DisposableBean {
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
	
	@Override
	public String toString() {
		return "NewTriangle [pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}
	
	/**
	 * This decouples me from the spring libraries and spring jars
	 * In spring.xml use init-method="myInit"
	 * Use this instead of afterPropertiesSet() from InitializingBean
	 */	
	public void myInit() {
		System.out.println("Initializng New Triangle Bean...MYINIT");
	}
	
	//Use this instead of destroy() from DisposableBean
	public void myDestroy() {
		System.out.println("MYDESTROY destroy method in New Triangle......");
	}
	
  /***** The DISADVANTAGE of doing this is you are tied to Spring code base and SPring libraries */

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializng New Triangle Bean....Init method called for NewTriangle");
	}

	//This happens when you register the shudown hook.
	//context.shutdownhook
	public void destroy() throws Exception {
		//This will get called first before myDestroy()....
		System.out.println("Disposable Beans destroy method in New Triangle......");
	}
	

}