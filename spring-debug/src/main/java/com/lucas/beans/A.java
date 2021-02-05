package com.lucas.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: licanpeng
 * @Date: 2021/2/5 14:17
 */
public class A implements ApplicationContextAware, BeanPostProcessor {

	private String name;

	private ApplicationContext applicationContext;

	public A() {
		System.out.println("执行A的构造器");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	private void init() {
		name = "暴瘦";

		System.out.println("执行对象A的 init-method ===> 给暴富起个外号叫:" + name);
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/*@Override
	public String toString() {
		return "A{" +
				"name='" + name + '\'' +
				'}';
	}*/

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}


}
