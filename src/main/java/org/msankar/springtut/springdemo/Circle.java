package org.msankar.springtut.springdemo;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//The @Component annotation is similar to creating a circle id in spring.xml file.


//@Service is stereotyping ...this will be picked up by componnent-scan tag.
@Service

//@Controller -- Contoller of MVC
//@Repository  -- Data
public class Circle implements Shape, ApplicationEventPublisherAware {
		
	private Point center;
	
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private MessageSource messageSource;
	//System.out.println(context.getMessage("greeting", null, "default hello", null));

	public Point getCenter() {
		return center;
	}

	@Required
	//@Autowired
	@Resource(name="pointC")
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(getMessageSource().getMessage("draw.circle", null, "Drawing a circle", Locale.ENGLISH));
		System.out.println(getMessageSource().getMessage("draw.point", new Object[]{center.getX(), center.getY()}, "point message", null));	
		
		getPublisher().publishEvent(new DrawEvent(this));
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}
	
	public ApplicationEventPublisher getPublisher() {
		return publisher;
	}

	public void setPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("init circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy circle");
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		//This publisher is an ApplicationContext
		this.setPublisher(publisher);
	}
}
