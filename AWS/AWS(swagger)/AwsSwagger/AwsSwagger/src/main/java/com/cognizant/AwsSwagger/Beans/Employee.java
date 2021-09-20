package com.cognizant.AwsSwagger.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="employees")
public class Employee {
	
		@Id
		@Column
		private int id;
		@Column
		private String name;
		@Column
		private String gender;
		@Column
		private int age;
		@Column
		private double salary;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Employee(int id, String name, String gender, int age, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.salary = salary;
		}
		public Employee() {
			
		}

		@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
				+ "]";
	}
}
