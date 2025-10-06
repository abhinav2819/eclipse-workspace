package com.springcore.reference;

public class Employee {
	private int empId;
	private String empName;
	private Certi empCerti;
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
	public Certi getEmpCerti() {
		return empCerti;
	}
	public void setEmpCerti(Certi empCerti) {
		this.empCerti = empCerti;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, Certi empCerti) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCerti = empCerti;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCerti=" + empCerti + "]";
	}
	
}
