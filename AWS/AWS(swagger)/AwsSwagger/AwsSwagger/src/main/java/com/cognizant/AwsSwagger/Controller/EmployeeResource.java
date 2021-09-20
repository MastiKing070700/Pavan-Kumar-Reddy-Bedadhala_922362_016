package com.cognizant.AwsSwagger.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.AwsSwagger.Beans.Employee;
import com.cognizant.AwsSwagger.Service.EmployeeService;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	

	@GetMapping("/list")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@PostMapping
	public String addEmployee(@RequestBody Employee employee) {
		List<Employee> list = employeeService.getAllEmployee();
		for(Employee emp: list) {
			if(emp.getId()==employee.getId()) {
			return "Employee with the Id : "+employee.getId()+"has been existing so unable to add it.";
			}
			
		}
		return employeeService.addEmployee(employee);
	}
	
}
