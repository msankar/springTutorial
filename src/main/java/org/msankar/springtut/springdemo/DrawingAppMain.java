package org.msankar.springtut.springdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring2.xml"});
		context.registerShutdownHook();		
		
		Shape shape1 = (Shape) context.getBean("postTriang");
		shape1.draw();
		
		Shape shape2 = (Shape) context.getBean("circle");
		shape2.draw();
		
		System.out.println(context.getMessage("greeting", null, "default hello", null));
		
		context.close();
	}

}
