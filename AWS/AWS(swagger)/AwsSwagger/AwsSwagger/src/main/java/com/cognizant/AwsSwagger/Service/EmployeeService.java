package com.cognizant.AwsSwagger.Service;

import java.util.List;

import com.cognizant.AwsSwagger.Beans.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	String addEmployee(Employee employee);

}
