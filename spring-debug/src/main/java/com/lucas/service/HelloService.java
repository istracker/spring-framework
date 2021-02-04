package com.lucas.service;

import org.springframework.stereotype.Service;

/**
 * @Author: licanpeng
 * @Date: 2021/2/4 17:19
 */

@Service
public class HelloService {

	public HelloService() {
		System.out.println("service init");
	}

	public void test() {
		System.out.println("invoke method test");
	}
}
