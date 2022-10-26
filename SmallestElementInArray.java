package com.BridgeLabz.Day3PracticeProblem;

public class SmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {10, 20, 30, 50, 60}; //Initialize array
		 int min = arr[0]; //Initialize max with first element of array
	     
		 for (int i = 0; i < arr.length; i++) {
			 if(arr[i] < min)
				 min = arr[i];
		 }
		 System.out.println("Smallest Element in Array is : " + min);


	}

}
