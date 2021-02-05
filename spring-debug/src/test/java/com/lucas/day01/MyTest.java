package com.lucas.day01;

import com.lucas.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: licanpeng
 * @Date: 2021/2/5 14:00
 */
public class MyTest {


	@Test
	public void test01() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");


		User bean = ac.getBean(User.class);
		System.out.println(bean);

	}
}
