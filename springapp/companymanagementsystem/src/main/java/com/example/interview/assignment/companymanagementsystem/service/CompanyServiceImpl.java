package com.example.interview.assignment.companymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.interview.assignment.companymanagementsystem.entity.Company;
import com.example.interview.assignment.companymanagementsystem.entity.Employee;
import com.example.interview.assignment.companymanagementsystem.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public Company saveCompany(Company company){
        return companyRepository.save(company);
    }

    public List<Company> getAllCompany(){
        return companyRepository.findAll();
    }

    public Company getCompanyById(int companyId){
        return companyRepository.findById(companyId).get();
    }

    public Company updateCompany(Company company){
    	Company updateResponse = companyRepository.save(company);
        return updateResponse;
     
    }

    public void deleteCompanyById(int companyId){
        companyRepository.deleteById(companyId);
    }
    
    
}
