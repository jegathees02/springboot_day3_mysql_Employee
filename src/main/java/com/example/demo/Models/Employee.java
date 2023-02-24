package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="table")
public class Employee {
	@Id
	private int id;
	private String employeeName;
	private int employeeAge;
	private long salary;
	
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String employeeName, int employeeAge, long salary) {
		super();
		this.setId(id);
		this.setEmployeeName(employeeName);
		this.setEmployeeAge(employeeAge);
		this.setSalary(salary);
	}
	public int getId() {
		return id;
	}
}
