package com.example.springapp.spring.entity;

import javax.persistence.*;

public class Employee2{
    private String employee_id;

    private String employeeName;
    private String city;
    private String postalCode;
  


    
    public Employee2(String employee_id,String employeeName,String city,String postalCode) {
		super();
		this.employee_id =employee_id;
		this.employeeName = employeeName;
		this.city = city;
		this.postalCode = postalCode;
    }
	
	
    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
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
