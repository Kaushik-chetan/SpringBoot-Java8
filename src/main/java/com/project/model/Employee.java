package com.project.model;

public class Employee {
	
	private Integer employeeId;
	
	private String employeeName;
	
	private Integer age;
	
	private String designation;
	
	private Long salary;
	
	private Long contactNo;
	
	private Address address;
	
	
	public Employee() {
		}
	
	
	public Employee(Integer employeeId, String employeeName, Integer age, String designation, Long salary, Long contactNo,
			Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
		this.contactNo = contactNo;
		this.address = address;
	}



	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
