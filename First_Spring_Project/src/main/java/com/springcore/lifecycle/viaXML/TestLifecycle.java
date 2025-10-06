package com.springcore.lifecycle.viaXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//As registerShutdownHook method was not inside the ApplicationContext interface so we moved to AbstractApplicatioContext.
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/viaXML/Config.xml");
		//Registering shutdown hook
		context.registerShutdownHook();
		Jalebi jalebi1 = (Jalebi) context.getBean("j1");
		System.out.println(jalebi1);
	}
}
