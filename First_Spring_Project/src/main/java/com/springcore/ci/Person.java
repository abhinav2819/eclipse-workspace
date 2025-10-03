package com.springcore.ci;

public class Person {
	private int personId;
	private String personName;
	private String personAddress;
	private Certi certi;
	
	public Person(int personId, String personName, String personAddress, Certi certi) {
		this.personId=personId;
		this.personName=personName;
		this.personAddress=personAddress;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return "Person {" + personId + " : " + personName + " : " +personAddress+ " : " + certi +"}";
	}
	
}
