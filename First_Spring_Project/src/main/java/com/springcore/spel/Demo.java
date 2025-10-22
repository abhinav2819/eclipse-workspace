package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{25+75}")
	private double x;
	@Value("#{500/2-58+6}")
	private double y;
	
	//Hear we have inserted static method of the java.lang.Math class and passed our desired parameter
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	//Hear we have inserted static variable which gives the value of euler's number similarly we can find more
	//static method or variable present in its respective classes followed by its package for this case our 
	//package is java.lang
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + "]";
	}
	
}
