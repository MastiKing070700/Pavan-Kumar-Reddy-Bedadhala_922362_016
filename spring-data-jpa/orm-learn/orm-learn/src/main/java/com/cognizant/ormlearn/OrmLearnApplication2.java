package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication2 {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	//@Autowired
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication2.class);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
//		Employee employee = employeeService.get(2);
//        System.out.println("employee :"+ employee);
		
		//testGetEmployee();
		//testAddEmployee();
		//testupdateEmployee();
		//testGetDepartment();
		//testAddSkillToEmployee();
		testGetAllPermanentEmployees();
		
	}

	// fetching the data from employee table based on id 
	private static void testGetEmployee() {
        LOGGER.info("Start");
        Employee employee = employeeService.get(1);
        LOGGER.debug("Employee:{}", employee);
        LOGGER.debug("Department:{}", employee.getDepartment());
        LOGGER.debug("Skills:{}", employee.getSkillList());
        LOGGER.info("End");

	}
	
	// adding the record into the employee table
	private static void testAddEmployee() {
		LOGGER.info("Start");
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dob = sdf.parse("06/08/2021");
			Employee employee= new Employee("Pavan",new BigDecimal(15000),true,dob);
			Department department = departmentService.get(1);
			employee.setDepartment(department);
			employeeService.save(employee);
			LOGGER.debug("Employee: {}",employee);
			LOGGER.debug("Department:{}", employee.getDepartment());
		} catch (ParseException e) {
		   LOGGER.error("Error: {}",e);
		}
		LOGGER.info("End");
	}
	
	// updating the em_dp_id in employee table
	private static void testupdateEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(1);
		Department department = departmentService.get(3);
		employee.setDepartment(department);
		employeeService.save(employee);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.info("End");
	}
	
	// fetching the data from department table based on id
	private static void testGetDepartment() {
		LOGGER.info("Start");
		Department department = departmentService.get(1);
		LOGGER.debug("Department:{}", department);
		LOGGER.debug("Department:{}", department.getEmployeeList());
		LOGGER.info("End");
	}
	
	// adding the skill to the employee based on the empId as well as skillId
	private static void testAddSkillToEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(4);
		Skill skill = skillService.get(2);
		Set<Skill> skillList = employee.getSkillList();
		skillList.add(skill);
		employee.setSkillList(skillList);
		employeeService.save(employee);
		LOGGER.info("End");
	}
	
	// fetching the data from the employee table where permanent == 1
	public static void testGetAllPermanentEmployees() {
        LOGGER.info("Start");
		List<Employee> employees = employeeService.getAllPermanentEmployees();
		LOGGER.debug("Permanent Employees:{}", employees);
		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));
		LOGGER.info("End");

		}
}
