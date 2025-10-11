package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainSACollection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigSACollection.xml");
		Person11 p1 = context.getBean("person1",Person11.class);
		System.out.println(p1);
		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("______________________________________________________");
		System.out.println(p1.getFeeStructure());
		System.out.println(p1.getFeeStructure().getClass().getName());
		System.out.println("______________________________________________________");
		System.out.println(p1.getProper());
		System.out.println(p1.getProper().getClass().getName());
		System.out.println("______________________________________________________");
		System.out.println(p1.getAge());
		System.out.println(p1.getAge().getClass().getName());
	}

}
