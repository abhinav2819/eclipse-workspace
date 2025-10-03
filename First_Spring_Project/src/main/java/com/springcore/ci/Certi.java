package com.springcore.ci;

public class Certi {
	private String certificateName;

	public Certi(String certificateName) {
		this.certificateName = certificateName;
	}

	@Override
	public String toString() {
		return "certificateName = " + certificateName + "";
	}
	
}
