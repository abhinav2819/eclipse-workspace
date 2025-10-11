package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person11 {
	private List<String> friends;
	private Map<String, Integer> feeStructure;
	private Properties proper;
	private Set<Integer> age;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	public Properties getProper() {
		return proper;
	}
	public void setProper(Properties proper) {
		this.proper = proper;
	}
	public Set<Integer> getAge() {
		return age;
	}
	public void setAge(Set<Integer> age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", proper=" + proper + ", age=" + age
				+ "]";
	}
	
}
