package com.springcore.ci.ambiguity;

public class Emp {
	private int x;
	private int y;
	
	public Emp(double x, double y) {
		this.x=(int)x;
		this.y=(int)y;
		System.out.println("Constructor : double, double");
	}
	public Emp(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Constructor : int, int");
	}
	public Emp(String x, String y) {
		this.x=Integer.parseInt(x);
		this.y=Integer.parseInt(y);
		System.out.println("Constructor : String, String");
	}
	
	public void doSum() {
		System.out.println("Sum : "+(this.x+this.y));
	}
	@Override
	public String toString() {
		return "Emp [x=" + x + ", y=" + y + "]";
	}
}
