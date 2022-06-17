package com.revature.oops;

public class EmployeeManager {
public static void main(String [] args) {
	
SalariedEmployee se= new SalariedEmployee(101,"tada",22);	
double sal =se.calculateSalary(se.getDaysPresent());
System.out.println("Id: "+se.getId()+ " Name :"+ se.getName()+ " Days Present :"+
					se.getDaysPresent()+ " Salary "+ sal);



ContractEmployee ce= new ContractEmployee(40);	
double salary=ce.calculateSalary(ce.getHoursWorked());	
System.out.println("Salary " + salary);

 }
}
