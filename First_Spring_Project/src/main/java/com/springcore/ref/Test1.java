package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/configRef.xml");
		A e1= (A) context.getBean("aref");
		
		B b1 = (B) context.getBean("bref");
		
		//This provide all the values stored in their all attributes
		System.out.println(e1);
		System.out.println(b1);
		
		//This will provide only the values store for single attribute
		System.out.println(e1.getX());
		System.out.println(e1.getOb().getY());
		
	}

}
