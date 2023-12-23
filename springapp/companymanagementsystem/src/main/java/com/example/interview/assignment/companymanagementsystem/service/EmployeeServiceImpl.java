package com.example.interview.assignment.companymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.interview.assignment.companymanagementsystem.entity.Employee;
import com.example.interview.assignment.companymanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int employeeId){
        return employeeRepository.findById(employeeId).get();
    }

    
    public Employee updateEmployee (Employee employee){
    	Employee updateResponse = employeeRepository.save(employee);
        return updateResponse;
    }

    public void deleteEmployeeById(int employeeId){
        employeeRepository.deleteById(employeeId);
    }
	
	
}

