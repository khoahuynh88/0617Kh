package com.revature.mypackage;

public class DescendingSort {
	public static int[] descending(int[] arr) {
		int temp,i,j;
		  int num = arr.length;
		  for (i = 0; i < ( num - 1 ); i++) {
		      for (j = 0; j < num - i - 1; j++) {
		        if (arr[j] < arr[j+1]) 
		        {
		          temp = arr[j];
		          arr[j] = arr[j+1];
		          arr[j+1] = temp;
		        }
		      }
		    }
	      return arr;
	 }
}
