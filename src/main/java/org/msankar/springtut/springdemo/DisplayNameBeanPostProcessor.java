package org.msankar.springtut.springdemo;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("DisplayNameBeanPostProcessor = postProcessAfterInitialization  " + beanName);
		return bean;
	}

	/**
	 * Return the bean. Make changes to the bean if necessary and then return it.
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("DisplayNameBeanPostProcessor = postProcessBeforeInitialization  " + beanName);
		return bean;
	}
	
}
