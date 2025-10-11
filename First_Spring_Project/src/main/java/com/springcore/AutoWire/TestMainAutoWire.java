package com.springcore.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.AutoWire.viaAnnotation.Emp;
import com.springcore.AutoWire.viaXML.Book1;

public class TestMainAutoWire {
	public static void main(String[] args) {
		//This is for the AutoWiring via XML
		
		/*ApplicationContext context = new
		  ClassPathXmlApplicationContext("ConfigAutoWireviaXML.xml"); 
		  Book1 b1 =context.getBean("book1",Book1.class); System.out.println(b1);*/
		 
		
		//This is for the AutoWiring via Annotation
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigAutoWirevaiAnnotation.xml");
		Emp e1 = context.getBean("emp1",Emp.class);
		System.out.println(e1);
	}
}
