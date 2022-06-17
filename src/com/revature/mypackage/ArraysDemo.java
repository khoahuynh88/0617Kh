package com.revature.mypackage;
// int arry with 10 element hard code do the following
//1.assigement a value to array
//2.display arry using enhance for loop
//3.calulate and display the sum of element of array
//4.display all the even number in array
//5.display all the old number in arry
//6.calculate and display the sum of even and old number
//7.sort the array
//8.find the average of the array
//9.display 3 greatest and 3 smallest
public class ArraysDemo {
		public static void main(String[] args) {
			
			  int marks[]=new int[5];
			    
			    int []arr2= {1,2,3,4,5,6,6,6,6};
			    
			    marks[0]=10;
			    marks[1]=12;
			    marks[2]=14;
			    marks[3]=16;
			    marks[4]=17;
			    
			    System.out.println("Length of Marks Array : "+marks.length);
			    System.out.println("Displaying the Third element : "+marks[2]);
			    
			    for(int i =0;i<5;i++)
			        System.out.println(marks[i]);
			    
			    
			    for(int j=0;j<marks.length;j++)
			        System.out.println(marks[j]);
			    
			    // Enhanced For Loop
			    for(int m:marks)
			        System.out.println(m);
			
			
			
			
		}
}
