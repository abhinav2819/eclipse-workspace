package com.springcore.lifecycle.viaXML;

public class Samosa {
	private double price;

	public double getPrice() {
		System.out.println("Getting the attribute");
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the attribute");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}
	
	//We change the name of the init and destroy method as per our choice because it is created by user only but this will not applicable for the Interface way.
	public void init() {
		System.out.println("Init method----");
	}
	public void destroy() {
		System.out.println("Destroy method----");
	}
}
