package com.handson.hibernate_basics.module1.vo;

public class Employee {

	private String employeeName;
	private int employeeId;
	private Address address;

	public String getEmployeeName() {
		return employeeName;
	}

	public Employee(String employeeName, int employeeId, Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.address = address;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
