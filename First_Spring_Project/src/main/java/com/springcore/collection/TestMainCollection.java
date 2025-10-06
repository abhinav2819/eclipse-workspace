package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainCollection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigCollection.xml");
		Person emp1 = (Person) context.getBean("person1");
		System.out.println(emp1);
	}

}
