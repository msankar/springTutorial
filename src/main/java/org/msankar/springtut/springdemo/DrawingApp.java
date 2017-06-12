package org.msankar.springtut.springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring1.xml"});
		context.registerShutdownHook();
		
		Triangle triangle = (Triangle) context.getBean("triangle");		
		triangle.draw();
		
		NewTriangle newTriangle = (NewTriangle) context.getBean("newTriangle");
		newTriangle.draw();
		
		NewTriangle newTriangle1 = (NewTriangle) context.getBean("newTriangle-alias");
		newTriangle1.draw();
		
		CollTriangle collTriangle = (CollTriangle) context.getBean("collTriangle");
		collTriangle.draw();
		
		AutowireTriangle autoWireTriangle = (AutowireTriangle) context.getBean("autowireTriangle");
		autoWireTriangle.draw();	
		
		Triangle triang = (Triangle) context.getBean("triang");		
		triang.draw();
		
		NewTriangle newTriangle22 = (NewTriangle) context.getBean("newTriangle33");
		newTriangle22.draw();
		
		CollTriangle newCollTriangle33 = (CollTriangle) context.getBean("newCollTriangle33");
		newCollTriangle33.draw();
		
		context.close();
	}
}
