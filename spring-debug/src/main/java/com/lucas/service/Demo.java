package com.lucas.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: licanpeng
 * @Date: 2021/2/4 17:19
 */
public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		HelloService helloService = ac.getBean(HelloService.class);
		helloService.test();
	}
}
