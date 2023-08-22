package com.example.springapp.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    private String employeeName;
    private String city;
    private String postalCode;
  

    public Employee() {
	super();
    }
    
    public Employee(int employeeId,String employeeName,String city,String postalCode) {
		super();
		this.employeeId =employeeId;
		this.employeeName = employeeName;
		this.city = city;
		this.postalCode = postalCode;
    }
	
	
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
}
