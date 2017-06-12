package org.msankar.springtut.springaop;

import org.msankar.springtut.springaop.service.FactoryService;
import org.msankar.springtut.springaop.service.ShapeService;

public class AopMain {


	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("springaop.xml");
//		//context.registerShutdownHook();
//		
//		
//		ShapeService shapeService =  context.getBean("shapeService", ShapeService.class);
//		//shapeService.getCircle().setNameAndReturn("my demo name");
//		shapeService.getCircle();
//		//shapeService.getCircle().setNameAndAround("aroundCircleName");
//		//System.out.println(shapeService.getCircle().getName());
//		//System.out.println(shapeService.getTriangle().getName());
//		
//		//context.close();
		
		FactoryService fs = new FactoryService();
		ShapeService shapeService = (ShapeService) fs.getBean("shapeService");
		shapeService.getCircle();

	}

}
