package com.springcore.noXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain_noXML {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig_noXML.class);
		CommanMan c1 = context.getBean("comman_man",CommanMan.class);
		System.out.println(c1);
		c1.demand();
	}

}
