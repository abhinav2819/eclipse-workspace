package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainRef {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigReference.xml");
		Employee emp1 = (Employee) context.getBean("employee1");
		Employee emp2 = (Employee) context.getBean("employee2");
		Employee emp3 = (Employee) context.getBean("employee3");
		Employee emp4 = (Employee) context.getBean("employee4");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
	}

}
