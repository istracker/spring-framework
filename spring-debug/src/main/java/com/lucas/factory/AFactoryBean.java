package com.lucas.factory;

import com.lucas.beans.A;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: licanpeng
 * @Date: 2021/2/5 18:19
 */
public class AFactoryBean implements FactoryBean<A> {
	@Override
	public A getObject() throws Exception {
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
