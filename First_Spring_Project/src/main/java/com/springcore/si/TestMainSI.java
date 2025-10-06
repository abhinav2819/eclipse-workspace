package com.springcore.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainSI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configSI.xml");
		Student st1 = (Student) context.getBean("student1");
		Student st2 = (Student) context.getBean("student2");
		Student st3 = (Student) context.getBean("student3");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}

}
