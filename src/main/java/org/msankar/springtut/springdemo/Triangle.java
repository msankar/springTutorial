package org.msankar.springtut.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{	

	private String type;
	private int height;
	private ApplicationContext context = null;
	

	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int ht) {
		this.height = ht;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		//context.getBean(arg0);
		System.out.println("Drawing a triangle of type " + getType() + getHeight());
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
	}

	public void setBeanName(String beanName) {
		//While initializing the bean spring sets this setter.
		//Spring looks for all the aware interfaces.
		System.out.println("Bean name is " + beanName);
	}
}
