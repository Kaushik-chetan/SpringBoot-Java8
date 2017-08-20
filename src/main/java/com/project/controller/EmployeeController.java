package com.project.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Employee;
import com.project.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;

@RequestMapping("/employee_api")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE ,MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> getEmployeeByCriteria(@RequestParam("city") String city, @RequestParam("salary") Long salary, @RequestParam("designation") String designation)
	{
       return employeeService.getAllEmployeesByCriteria(city, salary, designation);
	}
	

}
