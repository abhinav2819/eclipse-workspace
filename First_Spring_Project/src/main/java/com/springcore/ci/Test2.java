package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/configCI.xml");
		Person pers1 =(Person) context.getBean("person1");
		Person pers2 =(Person) context.getBean("person2");
		Person pers4 =(Person) context.getBean("person4");
		Addition add =(Addition) context.getBean("add");
		System.out.println(pers1);
		System.out.println(pers2);
		System.out.println(pers4);
		add.sum();
	}

}
