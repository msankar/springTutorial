package org.msankar.springtut.springaop.service;

import org.msankar.springtut.springaop.aspect.LoggingAspect;
import org.msankar.springtut.springaop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	@Override
	public Circle getCircle() {
		//This is similar to @Before
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}

}
