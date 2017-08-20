package com.project.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.project.model.Address;
import com.project.model.Employee;

@Service
public class EmployeeService {
	
	
    List<Employee> employeeList = new ArrayList<>();
	
	public EmployeeService()
	{
		Address address1 = new Address("street no 8", "Sec - 05", "Gurgaon", "Haryana", "India", 126102L);
		
		Address address2 = new Address("street no 2", "Sec - 09", "Pune", "Maharashtra", "India", 126102L);
		
		Address address3 = new Address("street no 3", "Sec - 11", "Banglore", "Karnataka", "India", 126102L);
		
		Address address4 = new Address("street no 4", "Sec - 39", "Gurgaon", "Haryana", "India", 126102L);
		
		Address address5 = new Address("street no 5", "Sec - 05", "Pune", "Maharashtra", "India", 126102L);
		
		
		employeeList.add(new Employee(1, "Chetan", 27, "Software Engineer", 40000L, 9599522150L, address1));
		employeeList.add(new Employee(2, "Nitin", 25, "Senior Software Engineer", 60000L, 8753124500L, address2));
		employeeList.add(new Employee(3, "Gaurav", 26, "Software Engineer", 45000L, 8753124123L, address3));
		employeeList.add(new Employee(4, "Sachin", 28, "Associate Software Engineer", 30000L, 8750609129L, address4));
		employeeList.add(new Employee(5, "Ankit", 25, "Senior Software Engineer", 60000L, 7659043210L, address5));
		
	}
	
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
    
	

	public List<Employee> getAllEmployeesByCriteria(String city, Long salary, String designation)
	{
		return employeeList.stream().filter(emp -> emp.getAddress().getCity().equalsIgnoreCase(city) && emp.getSalary()>salary && emp.getDesignation().equalsIgnoreCase(designation)).distinct().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
	}
	
	
}

