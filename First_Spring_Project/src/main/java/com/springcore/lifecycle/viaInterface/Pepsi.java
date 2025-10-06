package com.springcore.lifecycle.viaInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	//We use the interface class InitializingBean, DisposableBean to use these two abstract method to use the init and destroy method.
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is init method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroy method");
		
	}
}
