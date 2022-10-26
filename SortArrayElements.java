package com.BridgeLabz.Day3PracticeProblem;

import java.util.Arrays;   

public class SortArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {70, 60, 50, 40, 30, 20,}; //Initialize array
		Arrays.sort(arr);
		System.out.println("Elements of array sorted in ascending order: ");

		for (int i = 0; i < arr.length; i++)   
		{       
		System.out.println(arr[i]);   
		}   
	}

}
