package com.lucas.controller;

import com.lucas.beans.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @Author: licanpeng
 * @Date: 2021/2/5 11:29
 */


@Controller
public class UserController {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");


		//


		User user = (User) ac.getBean("user");

		User user1 = ac.getBean(User.class);

		System.out.println(user);
		System.out.println(user1);

	}

}
