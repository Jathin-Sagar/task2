package com.example.springapp.spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.springapp.spring.entity.Employee;
import com.example.springapp.spring.entity.Employee2;
import com.example.springapp.spring.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SpringappController {

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllItems() {
        List<Employee> employees = employeeRepo.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/a")
    public ResponseEntity<String> addEmployee(@RequestBody Employee emp) {
	    System.out.println("sssssssssss"+emp.getEmployeeId());
	    emp.setEmployeeId(emp.getEmployeeId());
            employeeRepo.save(emp);
            return new ResponseEntity<String>("data succesfully saved", HttpStatus.CREATED);
        }
}

