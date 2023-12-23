package com.example.interview.assignment.companymanagementsystem.service;

import java.util.List;

import com.example.interview.assignment.companymanagementsystem.entity.Company;

public interface CompanyService {

	public Company saveCompany(Company company);

    public List<Company> getAllCompany();
    
    public Company getCompanyById(int companyId);

    public Company updateCompany(Company company);
    
    public void deleteCompanyById(int companyId);
}
