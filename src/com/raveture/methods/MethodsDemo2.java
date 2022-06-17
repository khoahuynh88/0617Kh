package com.raveture.methods;

import java.util.Scanner;

public class MethodsDemo2 {
	
		 public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
		        System.out.print("Enter Number 1 : ");
		        int x = sc.nextInt();
		        System.out.print("Enter Number 2 : ");
		        int y = sc.nextInt();   
			 
		        //sum(x,y); // method call
		        System.out.println("Sum of " + x + " and " + y + " = " + sum(x,y));
		        System.out.println("Difference of " + x + " and " + y + " = " + subtract(x,y));
		        System.out.println("Multiply of " + x + " and " + y + " = " + multiply(x,y));
		        System.out.println("Devide of " + x + " and " + y + " = " + devide(x,y));
		    }
		    // method with var args or variable arguments
		    // ... num has to be the last parameter or the only one parameter
		    public static int sum(int ...num) {
		       
		        int result1 =0;
		        for (int i=0; i<num.length;i++)
		        	result1=result1+num[i];
		       	return result1;
		    }
		    
		    public static int subtract(int n3, int n4) {
		      
		        int result2 = n3 - n4;
				return result2;
		        
		    }
		    
		    public static int multiply(int n5, int n6) {
		       
		        int result3 = n5 * n6;
				return result3;
		        
		    }
		    public static double devide(double n7, double n8) {
		      
		        double result4 = n7 / n8;
				return result4;
		       
		    }
}
