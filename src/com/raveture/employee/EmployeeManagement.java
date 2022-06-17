package com.raveture.employee;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] employee=new Employee[5];
	 
		for (int i=0; i<employee.length; i++) {
			
			//Constructor
			employee[i]=new Employee();
		}	
		
		//create the 5 employee 
		
		employee[0].createEmployee(1000, "Aaa", "A", 90000.00);
		employee[1].createEmployee(1001, "Bbb", "M", 80000.00);
		employee[2].createEmployee(1002, "Ccc", "H", 50000.00);
		employee[3].createEmployee(1003, "Dee", "C", 70000.00);
		employee[4].createEmployee(1004, "Eee", "Q", 60000.00);
		
		//display all employee
		for (int i=0; i<employee.length; i++) {
			employee[i].displayEmployee();
		}
		
	}

}
