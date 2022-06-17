package com.raveture.methods;

import java.util.Scanner;

public class MethodsDemo {
	 public static void main(String[] args) {
	        sum(); // method call
	        subtract();
	        multiply();
	        devide();
	    }
	    // method definition
	    public static void sum() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Number 1 : ");
	        int n1 = sc.nextInt();
	        System.out.print("Enter Number 2 : ");
	        int n2 = sc.nextInt();
	        int result1 = n1 + n2;
	        System.out.println("Sum of " + n1 + " and " + n2 + " = " + result1);
	        System.out.println();
	    }
	    public static void subtract() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Number 3 : ");
	        int n3 = sc.nextInt();
	        System.out.print("Enter Number 4 : ");
	        int n4 = sc.nextInt();
	        int result2 = n3 - n4;
	        System.out.println("Difference of " + n3 + " and " + n4 + " = " + result2);
	        System.out.println();
	    }
	    public static void multiply() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Number 5 : ");
	        int n5 = sc.nextInt();
	        System.out.print("Enter Number 6 : ");
	        int n6 = sc.nextInt();
	        int result3 = n5 * n6;
	        System.out.println("Multiply of " + n5 + " and " + n6 + " = " + result3);
	        System.out.println();
	    }
	    public static void devide() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Number 7 : ");
	        double n7 = sc.nextDouble();
	        System.out.print("Enter Number 8 : ");
	        double n8 = sc.nextDouble();
	        double result4 = n7 / n8;
	        System.out.println("Devide of " + n7 + " and " + n8 + " = " + result4);
	        System.out.println();
	    }
}
