package com.cognizant.AwsSwagger.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.AwsSwagger.Beans.Employee;

public interface EmployeeRepositry extends JpaRepository<Employee,Integer>{
	
}
