package com.lucas.day01.reflect;

/**
 * @Author: licanpeng
 * @Date: 2021/2/5 14:38
 */


import com.lucas.beans.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射：1. 获取Class对象
 * 		2. 通过Class对象创建对象
 * 		3. 获取对象相关信息
 */
public class MyTest {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

		// 获取Class对象的三种方式
		// 1.
		User user = new User();
		Class<? extends User> userClazz1 = user.getClass();

		// 2.
		Class<User> userClazz2 = User.class;


		// 3.
		Class<?> userClazz3 = Class.forName("com.lucas.beans.User");

		System.out.println(userClazz1 == userClazz2 && userClazz1 == userClazz3);





		// 通过Class对象创建对象
		User user1 = userClazz1.newInstance();
		user1.setAge(10);
		user1.setName("暴富");
		user1.setGender("男");

		System.out.println(user1);



		// 获取构造器
		Constructor<User> ctor = userClazz2.getConstructor();
		User user2 = ctor.newInstance();

	}

}
