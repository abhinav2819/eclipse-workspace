package com.springcore.ci;

public class Addition {
	private int x;
	private int y;
	public Addition(double x, double y) {
		this.x =(int) x;
		this.y =(int) y;
		System.out.println("double, double");
	}
	public Addition(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("int, int");
	}
	public Addition(String x, String y) {
		this.x =Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("String, String");
	}
	public void sum() {
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println("Sum : "+(this.x+this.y));
	}
}
