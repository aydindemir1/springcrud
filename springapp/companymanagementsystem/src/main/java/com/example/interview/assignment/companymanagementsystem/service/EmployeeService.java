package com.example.interview.assignment.companymanagementsystem.service;

import java.util.List;

import com.example.interview.assignment.companymanagementsystem.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(int employeeId);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployeeById(int employeeId);
}
