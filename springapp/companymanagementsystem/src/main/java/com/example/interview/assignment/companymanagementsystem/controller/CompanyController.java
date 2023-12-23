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

import com.example.interview.assignment.companymanagementsystem.entity.Company;
import com.example.interview.assignment.companymanagementsystem.service.CompanyService;
import com.example.interview.assignment.companymanagementsystem.service.CompanyServiceImpl;

@RestController
@RequestMapping("/company")
public class CompanyController {

	    @Autowired
	    private  CompanyService companyService;

	    @PostMapping("/save")
	    public ResponseEntity<Company> saveCompany(@RequestBody Company company){
	        Company savedCompany = companyService.saveCompany(company);
	        return new ResponseEntity<Company>(savedCompany, HttpStatus.CREATED);
	    }

	    @GetMapping("/getall")
	    public ResponseEntity<List<Company>> getAllCompany(){
	        List<Company> allCompany = companyService.getAllCompany();
	        return new ResponseEntity<List<Company>>(allCompany, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Company> getCompanyById(@PathVariable(name = "id") Integer companyId){
	        Company company = companyService.getCompanyById(companyId);
	        return new ResponseEntity<Company>(company, HttpStatus.OK);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Company> updateCompanyById(@RequestBody Company company){
	        Company updatedCompany = companyService.updateCompany(company);
	        return new ResponseEntity<Company>(updatedCompany, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteCompanyById(@PathVariable(name = "id") Integer companyId){
	       companyService.deleteCompanyById(companyId);
	       return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	    }
}