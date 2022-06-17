package com.revature.mypackage;

public class SumArray {

	//3.	Calculate and display the sum of the elements of the array
	public static int sumArry (int [] arr) {
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
		sum= sum+arr[i];
		}
		return sum;}
}
