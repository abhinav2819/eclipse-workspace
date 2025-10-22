package com.springcore.noXML;

import org.springframework.stereotype.Component;

//First way is by using XML Configuration file
//Second way by using component annotation
//@Component("myCommanMan")

//Third way by using bean annotation in our java configuration class
public class CommanMan {
	
	private Money money;
	
	
	public CommanMan(Money money) {
		super();
		this.money = money;
	}


	public Money getMoney() {
		return money;
	}


	public void setMoney(Money money) {
		this.money = money;
	}
	
	public void demand() {
		this.money.amount();
		System.out.println("Comman man demands");
	}
}
