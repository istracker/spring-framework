package com.lucas.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: licanpeng
 * @Date: 2021/2/5 14:17
 */
public class Test {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		A a = (A) context.getBean("a");
		/*System.out.println(a.getApplicationContext());
		System.out.println(a);*/

		B b = context.getBean(B.class);
		b.show();
	}

}
