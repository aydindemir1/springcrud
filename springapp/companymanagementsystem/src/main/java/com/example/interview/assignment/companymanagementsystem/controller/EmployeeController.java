package com.example.interview.assignment.companymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.interview.assignment.companymanagementsystem.entity.Employee;
import com.example.interview.assignment.companymanagementsystem.service.EmployeeService;
import com.example.interview.assignment.companymanagementsystem.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	    @Autowired
	    private  EmployeeService employeeService;

	    @PostMapping("/save")
	    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	        Employee savedEmployee = employeeService.saveEmployee(employee);
	        return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
	    }

	    @GetMapping("/getall")
	    public ResponseEntity<List<Employee>> getAllEmployee(){
	        List<Employee> allEmployee = employeeService.getAllEmployee();
	        return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Employee> getEmployeeById(@PathVariable(name = "id") Integer employeeId){
	        Employee employee = employeeService.getEmployeeById(employeeId);
	        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	    }

	   
	    @PutMapping("/update/{id}")
	    public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee){
	        Employee updatedEmployee = employeeService.updateEmployee(employee);
	        return new ResponseEntity<Employee>(updatedEmployee, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteEmployeeById(@PathVariable(name = "id") Integer employeeId){
	        employeeService.deleteEmployeeById(employeeId);
	        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	    }
}
