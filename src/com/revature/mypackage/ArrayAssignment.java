package com.revature.mypackage;



//7.	Sort the array in descending and ascending order


public class ArrayAssignment {
	
	public static void main(String[] args) {
		//1.	Assign value to individual array elements – random values
		int []num= new int[10] ;
		num[0]=4;
		num[1]=6;
		num[2]=3;
		num[3]=2;
		num[4]=8;
		num[5]=5;
		num[6]=7;
		num[7]=9;
		num[8]=10;
		num[9]=30;
		
		// Method call
		//2.	Display array
		System.out.println("This is an array: ");
		Display.display(num);
		
		//3.	Sum of array
		System.out.println();
		System.out.println ("Sum of array is :" +SumArray.sumArry(num));
		
		//4.	Display all the even numbers in the array
		System.out.println("All even numbers of array: ");
		int[] even = EvenNum.evenNum(num) ;
		Display.display(even);
		System.out.println();
		
		//5.	Display all the odd numbers in the array
		System.out.println("All odd numbers of array: ");
		int[] odd = OddNum.oddNum(num) ;
		Display.display(odd);
		System.out.println();
		
		//6.	Calculate and display the sum of even and odd numbers
		System.out.println("Sum of all even numbers: "+SumArray.sumArry(even));
		System.out.println("Sum of all odd numbers: "+SumArray.sumArry(odd));
		
		//7.	Sort the array in descending and ascending order
		int[] des= DescendingSort.descending(num);
		System.out.println("Descending arry: ");
		Display.display(des);
		System.out.println();
		int[] as= AscendingSort.ascending(num);
		System.out.println("Ascending arry: ");
		Display.display(as);
		System.out.println();
		
		//8.	Find the average of the array
		System.out.println("Average of the array "+AverageArray.averageArry(num));
		
		//9.	Display the 3 greatest and smallest number
		LargestSmallest.largestSmallest(num);
	}
	
}

