package com.springcore.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/si/config.xml");
        Student st1 = (Student) context.getBean("student1");
        Student st2 = (Student) context.getBean("student2");
        Student st3 = (Student) context.getBean("student3");
        
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
