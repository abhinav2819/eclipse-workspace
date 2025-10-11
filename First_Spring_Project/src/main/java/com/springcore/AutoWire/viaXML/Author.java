package com.springcore.AutoWire.viaXML;

public class Author {
	private String men;
	private String women;
	public String getMen() {
		return men;
	}
	public void setMen(String men) {
		this.men = men;
		System.out.println("Setting Men");
	}
	public String getWomen() {
		return women;
	}
	public void setWomen(String women) {
		this.women = women;
		System.out.println("Setting Women");
	}
	@Override
	public String toString() {
		return "Author [men=" + men + ", women=" + women + "]";
	}
	
}
