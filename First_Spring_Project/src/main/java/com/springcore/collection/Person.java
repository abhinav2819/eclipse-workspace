package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private int empId;
	private String empName;
	private List<String> phone;
	private Set<String> addresses;
	private Map<String, String> cources;
	private Properties prop;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCources() {
		return cources;
	}
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int empId, String empName, List<String> phone, Set<String> addresses, Map<String, String> cources,
			Properties prop) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phone = phone;
		this.addresses = addresses;
		this.cources = cources;
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "Person [empId=" + empId + ", empName=" + empName + ", phone=" + phone + ", addresses=" + addresses
				+ ", cources=" + cources + ", prop=" + prop + "]";
	}
	
}
