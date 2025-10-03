package com.springcore.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/framework/ConfigCollection.xml");
		//WE can directly use this or use the type cast
		
//		Object employee1 = context.getBean("emp1");
		Emp employee1 =(Emp) context.getBean("emp1");
		
		//This will print in the full list(toString method)
		System.out.println(employee1);
		
		//This will print in the line by line
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhone());
		System.out.println(employee1.getAddresses());
		System.out.println(employee1.getCources());
		System.out.println(employee1.getProps());
	}

}
