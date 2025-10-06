package com.springcore.lifecycle.viaXML;

public class Jalebi {
	private double price;

	public double getPrice() {
		System.out.println("Getting the price");
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price");
		this.price = price;
	}

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}
	//We can change the name of the methods as per our desired names of the init and destroy.
	public void init() {
		System.out.println("Intit method started");
	}
	public void destroy() {
		System.out.println("Destroied the object");
	}
}
