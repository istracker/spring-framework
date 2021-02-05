package com.lucas.beans;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @Author: licanpeng
 * @Date: 2021/2/5 14:17
 */
public class B implements BeanNameAware {


	private String beanName;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public void show() {
		System.out.println(this.beanName);
	}
}
