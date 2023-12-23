package com.example.interview.assignment.companymanagementsystem.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.interview.assignment.companymanagementsystem.entity.Company;



@Repository
public interface CompanyRepository extends JpaRepository<Company, Serializable> {

}
