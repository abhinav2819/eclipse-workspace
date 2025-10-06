package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.lifecycle.viaXML.Samosa;

public class TestMainLifecycleXML {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ConfigLifecyclevaiXML.xml");
		//Registering the shutdown hook
		context.registerShutdownHook();
		Samosa sm1 = (Samosa) context.getBean("samosa1");
		System.out.println(sm1);
	}

}
