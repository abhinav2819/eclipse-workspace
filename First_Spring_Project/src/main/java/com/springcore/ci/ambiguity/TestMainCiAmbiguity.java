package com.springcore.ci.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainCiAmbiguity {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigCIAmbiguity.xml");
		Emp addition = (Emp) context.getBean("add");
		Emp addition1 = (Emp) context.getBean("add1");
		Emp addition2 = (Emp) context.getBean("add2");
		//We can create like this also
		//Object addition1 = context.getBean("add");
		System.out.println(addition);
		System.out.println("add :");
		addition.doSum();
		System.out.println(addition1);
		System.out.println("add1 :");
		addition1.doSum();
		System.out.println(addition2);
		System.out.println("add2 :");
		addition1.doSum();
	}

}
