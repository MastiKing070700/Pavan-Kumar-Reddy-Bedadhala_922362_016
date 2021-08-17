package com.cognizant.ormlearn.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.ormlearn.model.Employee;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value="SELECT e FROM Employee e WHERE e.permanent = 1")
	List<Employee> getAllPermanentEmployees();
}
