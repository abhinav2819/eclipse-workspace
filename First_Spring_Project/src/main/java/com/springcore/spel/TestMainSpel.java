package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestMainSpel {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigSpel.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		System.out.println(d1);
		
		//Another way to use the spring expression language by using SpelExpressionPraser
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("25+25");
		System.out.println(expression.getValue());
	}

}
