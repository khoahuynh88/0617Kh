package com.revature.mypackage;

public class EvenNum {
public static int[] evenNum(int [] arr) {
	
	int j=0;
	int size=0;
	//find the even array size
	for (int i=0; i<arr.length;i++) {
		if (arr[i]%2==0)
		{ size++;}}
	int [] even= new int[size];
	
	//store all the even number in an array
	for (int i=0; i<arr.length;i++) {
		if (arr[i]%2==0)
		{ even[j++]=arr[i];}
	}
	return even;
}
}
