package com.revature.mypackage;

public class LargestSmallest extends AscendingSort{
 public static void largestSmallest (int[] arr) {
	 int [] result = AscendingSort.ascending(arr);
	 
	 System.out.println("3 largest elements in array :" +result[result.length-1]+" "+result[result.length-2]+" "+result[result.length-3]);
	 
	 System.out.println("3 smallest elements in array :"+ result[0]+" "+result[1]+" "+result[2]);
 }
}
