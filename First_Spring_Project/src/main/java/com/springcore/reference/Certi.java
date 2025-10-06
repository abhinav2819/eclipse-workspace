package com.springcore.reference;

public class Certi {
	private String courceName;

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certi(String courceName) {
		super();
		this.courceName = courceName;
	}

	@Override
	public String toString() {
		return "Certi [courceName=" + courceName + "]";
	}
	
}
