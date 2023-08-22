package com.example.springapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Add this import

import com.example.springapp.spring.entity.Employee;

@Repository // Add this annotation
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

