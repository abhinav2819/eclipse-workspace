package com.springcore.AutoWire.viaAnnotation;

public class Address {
	private String locality;
	private String city;
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [locality=" + locality + ", city=" + city + "]";
	}
	
}
