package com.cognizant.AwsSwagger.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.AwsSwagger.Beans.Employee;
import com.cognizant.AwsSwagger.Repositry.EmployeeRepositry;
import com.cognizant.AwsSwagger.Service.EmployeeService;

@Service
public class EmployeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepositry.findAll();
	}

	@Override
	public String addEmployee(Employee employee) {
		employeeRepositry.save(employee);
		return "Employee with the Id : "+employee.getId()+"has been added succesfully";
	}

}
