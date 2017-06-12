package org.msankar.springtut.springdemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoEventListener implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
	}
	
//	org.springframework.context.event.ContextRefreshedEvent[source=org.springframework.context.support.ClassPathXmlApplicationContext@2608fb65: 
//		startup date [Wed Nov 13 09:01:26 PST 2013]; root of context hierarchy]
//
//	org.springframework.context.event.ContextClosedEvent[source=org.springframework.context.support.ClassPathXmlApplicationContext@2608fb65: 
//		startup date [Wed Nov 13 09:01:26 PST 2013]; root of context hierarchy]
	

}
