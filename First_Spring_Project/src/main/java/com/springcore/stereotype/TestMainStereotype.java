package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainStereotype {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigStereo.xml");
		Student st1 = context.getBean("student1",Student.class);
		System.out.println(st1);
		System.out.println(st1.hashCode());
		
		Student st2 = context.getBean("student1",Student.class);
		System.out.println(st2.hashCode());
	}

}
