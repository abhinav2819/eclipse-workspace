package com.springcore.framework;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> Phone;
	private Set<String> addresses;
	private Map<String, String> cources;
	private Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return Phone;
	}
	public void setPhone(List<String> phone) {
		Phone = phone;
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
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Emp(String name, List<String> phone, Set<String> addresses, Map<String, String> cources, Properties props) {
		super();
		this.name = name;
		Phone = phone;
		this.addresses = addresses;
		this.cources = cources;
		this.props = props;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", Phone=" + Phone + ", addresses=" + addresses + ", cources=" + cources
				+ ", props=" + props + "]";
	}
	
}
