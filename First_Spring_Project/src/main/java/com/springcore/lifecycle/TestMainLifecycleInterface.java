package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.lifecycle.viaInterface.Pepsi;

public class TestMainLifecycleInterface {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ConfigLifecyclevaiInterface.xml");
		//Registering the shutdown hook
		context.registerShutdownHook();
		Pepsi sm1 = (Pepsi) context.getBean("pepsi1");
		System.out.println(sm1);

	}

}
