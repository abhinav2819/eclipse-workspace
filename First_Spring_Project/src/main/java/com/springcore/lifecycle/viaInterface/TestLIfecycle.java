package com.springcore.lifecycle.viaInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLIfecycle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/viaInterface/Config.xml");
		context.registerShutdownHook();
		Pepsi pepsi1 = (Pepsi) context.getBean("p1");
		System.out.println(pepsi1);
	}

}
