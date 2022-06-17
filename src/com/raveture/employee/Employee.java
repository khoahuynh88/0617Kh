package com.raveture.employee;

public class Employee {
	int id;
	String name;
	String dep;
	double salary;
	
	public void createEmployee(int id, String name, String dep, double salary) {
		this.id = id;
		this.name= name;
		this.dep=dep;
		this.salary=salary;
		
	}
	
	public void displayEmployee() {
		System.out.println("Employee ID: "+ this.id + " Name: " + this.name +" Department: "+this.dep+" Salary:  " + this.salary);
	}
	
	
	
	}


